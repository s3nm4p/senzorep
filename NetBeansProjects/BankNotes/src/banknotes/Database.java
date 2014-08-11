package banknotes;

//package note;

/**
 *
 * @author sphamandla
 */
//package note;

/**
 *
 * @author sphamandla
 */
public class Database {
    /**
     *
     */
    public	Database(){

	}
        
	public double [] tenRandFronnew(){
		double [] moments = new  double [8];
		moments[0]=0.012351308058785836;
		moments[1]=3.961033994552736;
		moments[2]=0.06189621943242668;
                moments[3]=0.008112887317867988;
                moments[4]=1.7722874297493287E-5;
                moments[5]=1.9740508270353795E-5;
                moments[6]=-3.611608874479121E-5;

                
		//double mean =140.0;
		//moments[7]=mean;
		return moments;
	}
	public double [] tenRandBacknew(){
	    double [] moments = new  double [8];
	        moments[0]=0.009595796178684463;
		moments[1]=3.9710010298162084;
		moments[2]=0.024481522893336657;
                moments[3]=0.04073263918142991;
                moments[4]=0.0012585994527603659;
                moments[5]=1.967801632158087E-4;
                moments[6]=-4.0010002198014445E-4;
		//double mean =149.0;
		//moments[7]=mean;
		return moments;
	}
	
	public double [] tenRandFrontold(){
		double [] moments = new  double [8];
		moments[0]=0.012351308058785836;
		moments[1]=3.961033994552736;
		moments[2]=0.06189621943242668;
                moments[3]=0.008112887317867988;
                moments[4]=1.7722874297493287E-5;
                moments[5]=1.9740508270353795E-5;
                moments[6]=-3.611608874479121E-5;
		return moments;
	}
	public double [] tenRandBackold(){
	    double [] moments = new  double [8];
                moments[0]=0.01021945215413968;
		moments[1]=3.9665991748840783;
		moments[2]=0.06189621943242668;
                moments[3]=0.008112887317867988;
                moments[4]=1.7722874297493287E-5;
                moments[5]=1.9740508270353795E-5;
                moments[6]=-3.611608874479121E-5;
		return moments;
	}
	
	public double [] twentyRandNewFron(){
		double [] moments = new  double [8];
		moments[0]=0.012351308058785836;
		moments[1]=3.961033994552736;
		moments[2]=0.06189621943242668;
                moments[3]=0.008112887317867988;
                moments[4]=1.7722874297493287E-5;
                moments[5]=1.9740508270353795E-5;
                moments[6]=-3.611608874479121E-5;
		return moments;
	}
	public double [] twentyRandoldFront(){
		double [] moments = new  double [8];
		moments[0]=3.748272517333397E-4;
		moments[1]=4.944947348081268E-4;
		moments[2]=2.12931306540215E-7;
                moments[3]=3.468744635942639E-7;
                moments[4]=-3.6220996776339024E-8;
		return moments;
	}
	public double [] twentyRandNewback(){
		double [] moments = new  double [8];
		moments[0]=1.1538272726602048E-4;
		moments[1]=1.8072655611817335E-4;
		moments[2]=2.6070488256289516E-8;
                moments[3]=1.2798372028163785E-7;
                moments[4]=-4.634492031567099E-9;
		return moments;
	}
	public double [] twentyRandoldbck(){
		double [] moments = new  double [8];
		moments[0]= 7.163357112692244E-5;
		moments[1]=1.150639598958283E-4;
		moments[2]=1.0438318542022009E-8;
                moments[3]= 8.33548897150338E-8;
                moments[4]=3.805819600100735E-9;
		return moments;
	}
	public double [] fiftyRandoldFron(){
		double [] moments = new  double [8];
		moments[0]=5.809556397525789E-4;
		moments[1]= 7.006961715418936E-4;
		moments[2]=4.4701850509045266E-7;
                moments[3]=5.210966734217444E-7;
                moments[4]=6.113191337322501E-8;
		return moments;
	}
	public double [] fiftyRandoldback(){
		double [] moments = new  double [8];
		moments[0]=4.836827878334643E-4;
		moments[1]= 4.7041396281277795E-4;
		moments[2]=2.2340545087942264E-7;
                moments[3]= 3.328979413277622E-7;
                moments[4]=-9.364047792907956E-8;
		return moments;
	}
	public double [] fiftyRandNewFron(){
		double [] moments = new  double [8];
		moments[0]=1.1946397044326797E-4;
		moments[1]=1.60433494469925E-4;
		moments[2]=2.244560106923565E-8;
                moments[3]=1.270171305892574E-7;
                moments[4]=1.3086944003465435E-8;
		return moments;
	}
	public double [] fiftyRandNewBack(){
		double [] moments = new  double [8];
		moments[0]=1.4289865606633472E-4;
		moments[1]=2.2853592396794066E-4;
		moments[2]=4.134609869323212E-8;
                moments[3]=1.6821944486109814E-7;
                moments[4]=-1.100100902903043E-8;
		return moments;
	}
	public double [] onehundredoldBack(){
		double [] moments = new  double [8];
		moments[0]=9.119641449473416E-4;
		moments[1]=8.712620603921532E-4;
		moments[2]=7.702528721629165E-7;
                moments[3]=7.10644809593215E-7;
                moments[4]=-3.9049614185612943E-7;
		return moments;
	}
	public double [] onehundredoldfront(){
		double [] moments = new  double [8];
		moments[0]=4.8277874144614033E-4;
		moments[1]=6.790254910622342E-4;
		moments[2]=3.871617418960753E-7;
                moments[3]=5.37831998368163E-7;
                moments[4]=1.7265250239233325E-9;
		return moments;
	}
	public double [] onehundredNewBack(){
		double [] moments = new  double [8];
		moments[0]=1.4903302042083098E-4;
		moments[1]=1.9757832272490137E-4;
		moments[2]=3.387918645598995E-8;
                moments[3]=1.4918981986494818E-7;
                moments[4]=-4.484325469044571E-9;
		return moments;
	}
	public double [] onehundredNewFront(){
		double [] moments = new  double [8];
		moments[0]=1.7460803389297838E-4;
		moments[1]=2.0531453602121193E-4;
		moments[2]=3.888434609106568E-8;
                moments[3]=1.6384774483323258E-7;
                moments[4]=1.0760608594596288E-8;
		return moments;
	}
	
	public double [] twoHundredOldfront(){
		double [] moments = new  double [8];
		moments[0]=3.99676609847081;
		moments[1]=7.506457552997661E-5;
		moments[2]=1.0688757518453293E-4;
                moments[3]=9.597825691872552E-9;
                moments[4]=6.066240402926054E-8;
		return moments;
	}
	public double [] twoHundredOldBack(){
		double [] moments = new  double [8];
		moments[0]=4.063334690683123E-4;
		moments[1]=4.338143864603014E-4;
		moments[2]=1.8236931229822485E-7;
                moments[3]= 3.347780544301259E-7;
                moments[4]=-6.229445175762831E-8;
		return moments;
	}
	public double [] twoHundredNewFront(){
		double [] moments = new  double [8];
		moments[0]= 8.929880123806427E-5;
		moments[1]=1.1187261895016712E-4;
		moments[2]=1.1201289975397961E-8;
                moments[3]=9.647943713211065E-8;
                moments[4]=4.698436542974141E-9;
		return moments;
	}
	public double [] twoHundredNewBack(){
		double [] moments = new  double [8];
		moments[0]=9.602937712010967E-5;
		moments[1]=1.4358615471324012E-4;
		moments[2]= 1.6925945128511936E-8;
                moments[3]=1.1345522640654005E-7;
                moments[4]=-5.6605488225082415E-9;
		return moments;
	}

}
