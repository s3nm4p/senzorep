package banknotes;

//package note;

import java.awt.Image;

import javax.swing.JOptionPane;
//import note.Moments;


public class Classify {
	//Data fields
	 Database data ;
	MainApp dImage;
         static Image grayImage;
	 double [] unsortedDistance;
	 double [] sorted ;
	 //constructor
	Classify(){
	     data =  new Database();
	     //this.image=image;
             //image
             dImage=new MainApp();
	     unsortedDistance = new double [20];
	     sorted = new double [20];
	}


    //methods
public void classift(){
	//ten rand
	double [] invarData1 = data.tenRandBackold();
    double [] invarData2 = data.tenRandFrontold();
    double [] invarData3 = data.tenRandBacknew();
    double [] invarData4 = data.tenRandFronnew();
    //twenty rand
    double [] invarData5 = data.twentyRandoldbck();
    double [] invarData6 = data.twentyRandoldFront();
    double [] invarData7 = data.twentyRandNewback();
    double [] invarData8 = data.twentyRandNewFron();
    //fifty rand
    double [] invarData9 = data.fiftyRandoldback();
    double [] invarData10 = data.fiftyRandoldFron();
    double [] invarData11 = data.fiftyRandNewBack();
    double [] invarData12 = data.fiftyRandNewFron();
    //one hundred rand
    double [] invarData13 = data.onehundredoldBack();
    double [] invarData14 = data.onehundredoldfront();
    double [] invarData15 = data.onehundredNewBack();
    double [] invarData16= data.onehundredNewFront();
    //two hundred rand
    double [] invarData17=data.twoHundredOldBack();
    double [] invarData18=data.twoHundredOldfront();
    double [] invarData19=data.twoHundredNewBack();
    double [] invarData20=data.twoHundredNewFront();
		Moments m  = new Moments();
	     // Image  image =   dImage.power(dImage.grayImage);
               
		double [] testMoments = m.computeInvariantMoments(MainApp.grayImage);
	        

///10  old  back data 1
	               //training set 1
			double invar0DiffSquared1 =	Math.pow((testMoments[0]-invarData1[0]), 2);
			double invar1DiffSquared1=	Math.pow((testMoments[1]-invarData1[1]), 2);
			double invar2DiffSquared1=	Math.pow((testMoments[2]-invarData1[2]), 2);
                        double invar3DiffSquared1= Math.pow((testMoments[3]-invarData1[2]), 2);
                        double invar4DiffSquared1= Math.pow((testMoments[4]-invarData1[2]), 2);
                        double invar5DiffSquared1= Math.pow((testMoments[5]-invarData1[2]), 2);
			double sum1 = invar0DiffSquared1+invar1DiffSquared1+invar2DiffSquared1
                               +invar3DiffSquared1+invar4DiffSquared1+invar5DiffSquared1 ;
			double distance =Math.sqrt(sum1);
			//unsortedDistance[5]=distance3;;
			unsortedDistance[5]=distance;
			//System.out.println("distance   "+distance);

//10 old front		data 2
		     //training set 2
			double invar0DiffSquared2 =	Math.pow((testMoments[0]-invarData2[0]), 2);
			double invar1DiffSquared2=	Math.pow((testMoments[1]-invarData2[1]), 2);
			double invar2DiffSquared2=	Math.pow((testMoments[2]-invarData2[2]), 2);
                        double invar3DiffSquared2= Math.pow((testMoments[3]-invarData2[2]), 2);
                        double invar4DiffSquared2= Math.pow((testMoments[4]-invarData2[2]), 2);
                        double invar5DiffSquared2= Math.pow((testMoments[5]-invarData2[2]), 2);
			double sum2= invar0DiffSquared2+invar1DiffSquared2+invar2DiffSquared2
                               +invar3DiffSquared2+invar4DiffSquared2+invar5DiffSquared2 ;
			double distance2 =Math.sqrt(sum2);
			unsortedDistance[5]=distance2;
			//System.out.println("distance2   "+distance2);


//10 new back data 3
			 //training set 3
			double invar0DiffSquared3 =	Math.pow((testMoments[0]-invarData3[0]), 2);
			double invar1DiffSquared3=	Math.pow((testMoments[1]-invarData3[1]), 2);
			double invar2DiffSquared3=	Math.pow((testMoments[2]-invarData3[2]), 2);
                        double invar3DiffSquared3= Math.pow((testMoments[3]-invarData3[2]), 2);
                        double invar4DiffSquared3= Math.pow((testMoments[4]-invarData3[2]), 2);
                        double invar5DiffSquared3= Math.pow((testMoments[5]-invarData3[2]), 2);
			double sum3 = invar0DiffSquared3+invar1DiffSquared3+invar2DiffSquared3
                               +invar3DiffSquared3+invar4DiffSquared3+invar5DiffSquared3 ;
			double distance3 =Math.sqrt(sum3);
			unsortedDistance[5]=distance3;
			//System.out.println("distance3   "+distance3);

//10 new front	data 4
			 //training set 4
			double invar0DiffSquared4=	Math.pow((testMoments[0]-invarData4[0]), 2);
			double invar1DiffSquared4=	Math.pow((testMoments[1]-invarData4[1]), 2);
			double invar2DiffSquared4=	Math.pow((testMoments[2]-invarData4[2]), 2);
                        double invar3DiffSquared4= Math.pow((testMoments[3]-invarData4[2]), 2);
                        double invar4DiffSquared4= Math.pow((testMoments[4]-invarData4[2]), 2);
                        double invar5DiffSquared4= Math.pow((testMoments[5]-invarData4[2]), 2);
			double sum4 = invar0DiffSquared4+invar1DiffSquared4+invar2DiffSquared4
                               +invar3DiffSquared4+invar4DiffSquared4+invar5DiffSquared4 ;
			double distance4 =Math.sqrt(sum4);
			unsortedDistance[5]=distance4;
			//System.out.println("distance4   "+distance4);

//20 old back new  		data 5
			 //training set 5
			double invar0DiffSquared5 =	Math.pow((testMoments[0]-invarData5[0]), 2);
			double invar1DiffSquared5=	Math.pow((testMoments[1]-invarData5[1]), 2);
			double invar2DiffSquared5=	Math.pow((testMoments[2]-invarData5[2]), 2);
                        double invar3DiffSquared5= Math.pow((testMoments[3]-invarData5[2]), 2);
                        double invar4DiffSquared5= Math.pow((testMoments[4]-invarData5[2]), 2);
                        double invar5DiffSquared5= Math.pow((testMoments[5]-invarData5[2]), 2);
			double sum5 = invar0DiffSquared5+invar1DiffSquared5+invar2DiffSquared5
                               +invar3DiffSquared5+invar4DiffSquared5+invar5DiffSquared5 ;
			double distance5 =Math.sqrt(sum5);
			//unsortedDistance[5]=distance3;
			unsortedDistance[5]=distance5;
			//System.out.println("distance5  "+distance5);

//20	old front	data 6
			 
			double invar0DiffSquared6 =	Math.pow((testMoments[0]-invarData6[0]), 2);
			double invar1DiffSquared6=	Math.pow((testMoments[1]-invarData6[1]), 2);
			double invar2DiffSquared6=	Math.pow((testMoments[2]-invarData6[2]), 2);
                        double invar3DiffSquared6= Math.pow((testMoments[3]-invarData6[2]), 2);
                        double invar4DiffSquared6= Math.pow((testMoments[4]-invarData6[2]), 2);
                        double invar5DiffSquared6= Math.pow((testMoments[5]-invarData6[2]), 2);
			double sum6 = invar0DiffSquared6+invar1DiffSquared6+invar2DiffSquared6
                               +invar3DiffSquared6+invar4DiffSquared6+invar5DiffSquared6 ;
			double distance6 =Math.sqrt(sum6);
			//unsortedDistance[5]=distance3;
			unsortedDistance[5]=distance6;
			//System.out.println("distance6  "+distance6);

//20 new back	data 7
			 
			double invar0DiffSquared7 =	Math.pow((testMoments[0]-invarData7[0]), 2);
			double invar1DiffSquared7=	Math.pow((testMoments[1]-invarData7[1]), 2);
			double invar2DiffSquared7=	Math.pow((testMoments[2]-invarData7[2]), 2);
                        double invar3DiffSquared7= Math.pow((testMoments[3]-invarData7[2]), 2);
                        double invar4DiffSquared7= Math.pow((testMoments[4]-invarData7[2]), 2);
                        double invar5DiffSquared7= Math.pow((testMoments[5]-invarData7[2]), 2);
			double sum7 = invar0DiffSquared7+invar1DiffSquared7+invar2DiffSquared7
                               +invar3DiffSquared7+invar4DiffSquared7+invar5DiffSquared7 ;
			double distance7 =Math.sqrt(sum7);
			unsortedDistance[5]=distance7;
			//System.out.println("distance7  "+distance7);
//20 new front	data 8
			 //training set 8
			double invar0DiffSquared8 =	Math.pow((testMoments[0]-invarData8[0]), 2);
			double invar1DiffSquared8=	Math.pow((testMoments[1]-invarData8[1]), 2);
			double invar2DiffSquared8=	Math.pow((testMoments[2]-invarData8[2]), 2);
                        double invar3DiffSquared8= Math.pow((testMoments[3]-invarData8[2]), 2);
                        double invar4DiffSquared8= Math.pow((testMoments[4]-invarData8[2]), 2);
                        double invar5DiffSquared8= Math.pow((testMoments[5]-invarData8[2]), 2);
			double sum8 = invar0DiffSquared8+invar1DiffSquared8+invar2DiffSquared8
                               +invar3DiffSquared8+invar4DiffSquared8+invar5DiffSquared8 ;
			double distance8 =Math.sqrt(sum8);
			unsortedDistance[5]=distance8;
			//System.out.println("distance8  "+distance8);

//50 old back	data 9
			 //training set 9
			double invar0DiffSquared9 =	Math.pow((testMoments[0]-invarData9[0]), 2);
			double invar1DiffSquared9=	Math.pow((testMoments[1]-invarData9[1]), 2);
			double invar2DiffSquared9=	Math.pow((testMoments[2]-invarData9[2]), 2);
                        double invar3DiffSquared9= Math.pow((testMoments[3]-invarData9[2]), 2);
                        double invar4DiffSquared9= Math.pow((testMoments[4]-invarData9[2]), 2);
                        double invar5DiffSquared9= Math.pow((testMoments[5]-invarData9[2]), 2);
			double sum9 = invar0DiffSquared9+invar1DiffSquared9+invar2DiffSquared9
                               +invar3DiffSquared9+invar4DiffSquared9+invar5DiffSquared9 ;
			double distance9 =Math.sqrt(sum9);
			unsortedDistance[5]=distance9;
			//System.out.println("distance9  "+distance9);

//50 old front 		data 10
			 //training set 10
			double invar0DiffSquared10 =	Math.pow((testMoments[0]-invarData10[0]), 2);
			double invar1DiffSquared10=	Math.pow((testMoments[1]-invarData10[1]), 2);
			double invar2DiffSquared10=	Math.pow((testMoments[2]-invarData10[2]), 2);
                        double invar3DiffSquared10= Math.pow((testMoments[3]-invarData10[2]), 2);
                        double invar4DiffSquared10= Math.pow((testMoments[4]-invarData10[2]), 2);
                        double invar5DiffSquared10= Math.pow((testMoments[5]-invarData10[2]), 2);
			double sum10 = invar0DiffSquared10+invar1DiffSquared10+invar2DiffSquared10
                               +invar3DiffSquared10+invar4DiffSquared10+invar5DiffSquared10 ;
			double distance10 =Math.sqrt(sum10);
			unsortedDistance[5]=distance10;
			//System.out.println("distance10  "+distance10);

//50 new back		data 11
			 //training set 11
			double invar0DiffSquared11 =	Math.pow((testMoments[0]-invarData11[0]), 2);
			double invar1DiffSquared11=	Math.pow((testMoments[1]-invarData11[1]), 2);
			double invar2DiffSquared11=	Math.pow((testMoments[2]-invarData11[2]), 2);
                        double invar3DiffSquared11= Math.pow((testMoments[3]-invarData11[2]), 2);
                        double invar4DiffSquared11= Math.pow((testMoments[4]-invarData11[2]), 2);
                        double invar5DiffSquared11= Math.pow((testMoments[5]-invarData11[2]), 2);
			double sum11 = invar0DiffSquared11+invar1DiffSquared11+invar2DiffSquared11
                               +invar3DiffSquared11+invar4DiffSquared11+invar5DiffSquared11 ;
			double distance11 =Math.sqrt(sum11);
			unsortedDistance[5]=distance11;
			//System.out.println("distance11  "+distance11);


//50 new front		data 12
			 //training set 12
			double invar0DiffSquared12 =	Math.pow((testMoments[0]-invarData12[0]), 2);
			double invar1DiffSquared12=	Math.pow((testMoments[1]-invarData12[1]), 2);
			double invar2DiffSquared12=	Math.pow((testMoments[2]-invarData12[2]), 2);
                        double invar3DiffSquared12= Math.pow((testMoments[3]-invarData12[2]), 2);
                        double invar4DiffSquared12= Math.pow((testMoments[4]-invarData12[2]), 2);
                        double invar5DiffSquared12= Math.pow((testMoments[5]-invarData12[2]), 2);
			double sum12 = invar0DiffSquared12+invar1DiffSquared12+invar2DiffSquared12
                               +invar3DiffSquared12+invar4DiffSquared12+invar5DiffSquared12 ;
			double distance12 =Math.sqrt(sum12);
			unsortedDistance[5]=distance12;
			//System.out.println("distance12  "+distance12);

//100 old back 		data 13
			 //training set 13
			double invar0DiffSquared13=	Math.pow((testMoments[0]-invarData13[0]), 2);
			double invar1DiffSquared13=	Math.pow((testMoments[1]-invarData13[1]), 2);
			double invar2DiffSquared13=	Math.pow((testMoments[2]-invarData13[2]), 2);
                        double invar3DiffSquared13= Math.pow((testMoments[3]-invarData13[2]), 2);
                        double invar4DiffSquared13= Math.pow((testMoments[4]-invarData13[2]), 2);
                        double invar5DiffSquared13= Math.pow((testMoments[5]-invarData13[2]), 2);
			double sum13 = invar0DiffSquared13+invar1DiffSquared13+invar2DiffSquared13
                               +invar3DiffSquared13+invar4DiffSquared13+invar5DiffSquared13 ;
			double distance13 =Math.sqrt(sum13);
			unsortedDistance[5]=distance13;
			//System.out.println("distance13  "+distance13);


//100 old front	data 14
			 //training set 14
			double invar0DiffSquared14 =	Math.pow((testMoments[0]-invarData14[0]), 2);
			double invar1DiffSquared14=	Math.pow((testMoments[1]-invarData14[1]), 2);
			double invar2DiffSquared14=	Math.pow((testMoments[2]-invarData14[2]), 2);
                        double invar3DiffSquared14= Math.pow((testMoments[3]-invarData14[2]), 2);
                        double invar4DiffSquared14= Math.pow((testMoments[4]-invarData14[2]), 2);
                        double invar5DiffSquared14= Math.pow((testMoments[5]-invarData14[2]), 2);
			double sum14 = invar0DiffSquared14+invar1DiffSquared14+invar2DiffSquared14
                               +invar3DiffSquared14+invar4DiffSquared14+invar5DiffSquared14 ;
			double distance14 =Math.sqrt(sum14);
			unsortedDistance[5]=distance14;  //"+distance14);


//100 new back 		data 15
			 //training set 15
			double invar0DiffSquared15=	Math.pow((testMoments[0]-invarData15[0]), 2);
			double invar1DiffSquared15=	Math.pow((testMoments[1]-invarData15[1]), 2);
			double invar2DiffSquared15=	Math.pow((testMoments[2]-invarData15[2]), 2);
                        double invar3DiffSquared15= Math.pow((testMoments[3]-invarData15[2]), 2);
                        double invar4DiffSquared15= Math.pow((testMoments[4]-invarData15[2]), 2);
                        double invar5DiffSquared15= Math.pow((testMoments[5]-invarData15[2]), 2);
			double sum15 = invar0DiffSquared15+invar1DiffSquared15+invar2DiffSquared15
                               +invar3DiffSquared15+invar4DiffSquared15+invar5DiffSquared15 ;
			double distance15 =Math.sqrt(sum15);
			unsortedDistance[5]=distance15;
			//System.out.println("distance15  "+distance15);

//100 new front  //16
			double invar0DiffSquared16 =	Math.pow((testMoments[0]-invarData16[0]), 2);
			double invar1DiffSquared16=	Math.pow((testMoments[1]-invarData16[1]), 2);
			double invar2DiffSquared16=	Math.pow((testMoments[2]-invarData16[2]), 2);
                        double invar3DiffSquared16= Math.pow((testMoments[3]-invarData16[2]), 2);
                        double invar4DiffSquared16= Math.pow((testMoments[4]-invarData16[2]), 2);
                        double invar5DiffSquared16= Math.pow((testMoments[5]-invarData16[2]), 2);
			double sum16 = invar0DiffSquared16+invar1DiffSquared16+invar2DiffSquared16
                               +invar3DiffSquared16+invar4DiffSquared16+invar5DiffSquared16 ;
			double distance16 =Math.sqrt(sum16);
			unsortedDistance[16]=distance16;
//200 old back  //17
			double invar0DiffSquared17=	Math.pow((testMoments[0]-invarData17[0]), 2);
			double invar1DiffSquared17=	Math.pow((testMoments[1]-invarData17[1]), 2);
			double invar2DiffSquared17=	Math.pow((testMoments[2]-invarData17[2]), 2);
                        double invar3DiffSquared17= Math.pow((testMoments[3]-invarData17[2]), 2);
                        double invar4DiffSquared17= Math.pow((testMoments[4]-invarData17[2]), 2);
                        double invar5DiffSquared17= Math.pow((testMoments[5]-invarData17[2]), 2);
			double sum17= invar0DiffSquared17+invar1DiffSquared17+invar2DiffSquared17
                               +invar3DiffSquared17+invar4DiffSquared17+invar5DiffSquared17 ;
			double distance17 =Math.sqrt(sum17);
			unsortedDistance[17]=distance17;
//200 old front //18
			double invar0DiffSquared18 =	Math.pow((testMoments[0]-invarData18[0]), 2);
			double invar1DiffSquared18=	Math.pow((testMoments[1]-invarData18[1]), 2);
			double invar2DiffSquared18=	Math.pow((testMoments[2]-invarData18[2]), 2);
                        double invar3DiffSquared18= Math.pow((testMoments[3]-invarData18[2]), 2);
                        double invar4DiffSquared18= Math.pow((testMoments[4]-invarData18[2]), 2);
                        double invar5DiffSquared18= Math.pow((testMoments[5]-invarData18[2]), 2);
			double sum18 = invar0DiffSquared18+invar1DiffSquared18+invar2DiffSquared18
                               +invar3DiffSquared18+invar4DiffSquared18+invar5DiffSquared18 ;
			double distance18 =Math.sqrt(sum18);
			unsortedDistance[18]=distance18;
//200 new back //19
			double invar0DiffSquared19 =	Math.pow((testMoments[0]-invarData19[0]), 2);
			double invar1DiffSquared19=	Math.pow((testMoments[1]-invarData19[1]), 2);
			double invar2DiffSquared19=	Math.pow((testMoments[2]-invarData19[2]), 2);
                        double invar3DiffSquared19= Math.pow((testMoments[3]-invarData19[2]), 2);
                        double invar4DiffSquared19= Math.pow((testMoments[4]-invarData19[2]), 2);
                        double invar5DiffSquared19= Math.pow((testMoments[5]-invarData19[2]), 2);
			double sum19= invar0DiffSquared19+invar1DiffSquared19+invar2DiffSquared19
                               +invar3DiffSquared19+invar4DiffSquared19+invar5DiffSquared19 ;
			double distance19 =Math.sqrt(sum19);
			unsortedDistance[19]=distance19;
     //200 new front                   ///20
			double invar0DiffSquared20 =	Math.pow((testMoments[0]-invarData20[0]), 2);
			double invar1DiffSquared20=	Math.pow((testMoments[1]-invarData20[1]), 2);
			double invar2DiffSquared20=	Math.pow((testMoments[2]-invarData20[2]), 2);
                        double invar3DiffSquared20= Math.pow((testMoments[3]-invarData20[2]), 2);
                        double invar4DiffSquared20= Math.pow((testMoments[4]-invarData20[2]), 2);
                        double invar5DiffSquared20= Math.pow((testMoments[5]-invarData20[2]), 2);
			double sum20 = invar0DiffSquared20+invar1DiffSquared20+invar2DiffSquared20
                               +invar3DiffSquared20+invar4DiffSquared20+invar5DiffSquared20;
			double distance20 =Math.sqrt(sum20);
			unsortedDistance[19]=distance20;
			
			 int index =-1;
           for(int i=0;i<unsortedDistance.length;i++){
        	   if(unsortedDistance[i]==0.0){
        		   index=i;
        	      }
              }
           if(index!=-1){
        	   classifyHelperMethod(index);
               }
           else{
        	   sorted=unsortedDistance.clone();
        	   for(int k=0;k<unsortedDistance.length;k++){
        		   sorted[k]=unsortedDistance[k];
        	   }
        	  selectionSort(sorted);
        	    double minimum =sorted [0];
        	    int index2 =-1;
        	   if(minimum <= 0.00000000005){
                for(int i=0;i<unsortedDistance.length;i++){
             	   if(unsortedDistance[i]==minimum){
             		  index2=i;
             	      }
                   }
                if(index2!=-1){
             	   classifyHelperMethod(index2);
                    }
        	   }
                else JOptionPane.showMessageDialog(null, "could not clasify the image","Information", JOptionPane.INFORMATION_MESSAGE);
            	  // System.out.println("");
           }
           System.out.println("====================================== ");

          for(int i=0;i<sorted.length;i++){
        	   System.out.println(" :  "+sorted[i]);
              }

     }//end classify

public void classifyHelperMethod(int index){
	  switch(index){
      case 0 :JOptionPane.showMessageDialog(null, "R10 old","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 1 :JOptionPane.showMessageDialog(null, "R10 old","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 2 :JOptionPane.showMessageDialog(null, "R10 new","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 3 :JOptionPane.showMessageDialog(null, "R10 new","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 4 :JOptionPane.showMessageDialog(null, "R20 old","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 5 :JOptionPane.showMessageDialog(null, "R20 old","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 6 :JOptionPane.showMessageDialog(null, "R20 new","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 7 :JOptionPane.showMessageDialog(null, "R20 new","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 8 :JOptionPane.showMessageDialog(null, "R50 old","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 9 :JOptionPane.showMessageDialog(null, "R50 old","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 10 :JOptionPane.showMessageDialog(null, "R50 new ","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 11 :JOptionPane.showMessageDialog(null, "R50 new","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 12 :JOptionPane.showMessageDialog(null, "R100 0ld","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 13 :JOptionPane.showMessageDialog(null, "R100 old","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 14 :JOptionPane.showMessageDialog(null, "R100 new","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 15 :JOptionPane.showMessageDialog(null, "R100 new","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 16 :JOptionPane.showMessageDialog(null, "R200 old","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 17:JOptionPane.showMessageDialog(null, "R200 Old","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 18:JOptionPane.showMessageDialog(null, "R200 new","Information", JOptionPane.INFORMATION_MESSAGE);break;
      case 19: JOptionPane.showMessageDialog(null, "R200 new","Information", JOptionPane.INFORMATION_MESSAGE);break;
      }
}
	 /** The method for sorting the numbers */
	 public  void selectionSort(double[] list) {
		 for (int i = 0; i < list.length - 1; i++) {
	 // Find the minimum in the list[i..list.length-1]
	            double currentMin = list[i];
	                int currentMinIndex = i;
	       for (int j = i + 1; j < list.length; j++) {
	                    if (currentMin > list[j]) {
	                             currentMin = list[j];
	                             currentMinIndex = j;
	                          }
	               }

	               // Swap list[i] with list[currentMinIndex] if necessary;
	                    if (currentMinIndex != i) {
	                      list[currentMinIndex] = list[i];
	                       list[i] = currentMin;
	                   }
                  }
            }//end sort

}
