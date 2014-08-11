package banknotes;

import java.awt.image.BufferedImage;

class Erosion extends Filter {

        int radius;

        public Erosion(int radius) {
                this.radius = radius;
        }

        private int minAround(BufferedImage image, int row, int col) {
                int minR = 255;
                int minG = 255;
                int minB = 255;
                int radius2 = radius * radius;
                for (int dRow = -radius; dRow <= radius; dRow++) {
                        for (int dCol = -radius; dCol <= radius; dCol++) {
                                if (dRow * dRow + dCol * dCol <= radius2) {
                                        int c = ImagingUtility.getRGBExtended(image, row + dRow, col + dCol);
                                        minR = Math.min(minR, (c >> 16) & 0xFF);
                                        minG = Math.min(minG, (c >> 8) & 0xFF);
                                        minB = Math.min(minB, c & 0xFF);
                                }
                        }
                }
                return (minR << 16) | (minG << 8) | minB;
        }

        @Override
        public BufferedImage apply(BufferedImage image) {

                int width = image.getWidth();
                int height = image.getHeight();

                BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);

                for (int row = 0; row < height; row++) {
                        progress = 100 * row / height;
                        for (int col = 0; col < width && cancelFlag == false; col++) {
                                img.setRGB(col, row, minAround(image, row, col));
                        }
                }

                return img;
        }


}

