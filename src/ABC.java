import java.awt.*;

import java.awt.event.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;
public class ABC extends JFrame implements ActionListener {
	/**
	 * create by liangzhicheng
	 */
	private static final long serialVersionUID = 1L;
/*----------------------------------------------------------------------------------------------------
* ��ӽ���ѡ����
* ---------------------------------------------------------------------------------------------------*/	
		JTabbedPane jtb =new JTabbedPane();	
		JPanel jp1=new JPanel();	//����ѡ�JPanelΪ�������
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		JPanel jp4=new JPanel();
		JPanel jp5=new JPanel();
		JPanel jp6=new JPanel();
		JPanel jp7=new JPanel();
/*----------------------------------------------------------------------------------------------------
* ���Java����ʦ�������Ӧ����
* ---------------------------------------------------------------------------------------------------*/			
		JButton jbj1=new JButton("ȷ��");//���java�������
		JButton jbj12=new JButton("����");
		JButton jbj11=new JButton("���ݱ���");		
		JLabel jlj1=new JLabel("IT����");
		JLabel jlj2=new JLabel("��������");
		JLabel jlj3=new JLabel("ѧϰʱ��");
		JLabel jlj4=new JLabel("���Լ���");		
		JCheckBox jcbj1 = new JCheckBox("Oracle");	
		JCheckBox jcbj2 = new JCheckBox("Mysql");	
		JCheckBox jcbj3 = new JCheckBox("Java");
		JCheckBox jcbj4 = new JCheckBox("Javascript");	
		JCheckBox jcbj5 = new JCheckBox("Linux");	
		JCheckBox jcbj6 = new JCheckBox("Jsp");
		JCheckBox jcbj11 = new JCheckBox("Oracle SQL Developer");
		JCheckBox jcbj12 = new JCheckBox("MySQL Workbench");
		JCheckBox jcbj13 = new JCheckBox("Eclipse");
		JCheckBox jcbj14 = new JCheckBox("Firebug");
		JCheckBox jcbj15 = new JCheckBox("Bluefish");
		JCheckBox jcbj16 = new JCheckBox("Jbuilder");		
		Vector vj =new Vector(); 
		JComboBox jcbbj=new JComboBox(vj);	
		TextArea taj =new TextArea("�������");
		 double Salaryj;
	     double  Salary1j;
	     double  Salary2j;
	     double  Salary3j;
	     double  Salary4j;
	     double  Salary5j;
	     double  Gradesj;
	     double  Grades1j;
	     double  Grades2j;
	     double  Grades3j;
	     double  Grades4j;
	     double  Grades5j;
		//���JAVA����ʦ��Ҫ����
	    double a1j=329.55,b1j=10.14*0.5;
		double a2j=273.00,b2j=8.40*0.5;
		double a3j=355.55,b3j=10.94*0.5;	
		double a4j=186.90,b4j=5.72*0.5;
		double a5j=156.00,b5j=4.80*0.5;
		double bj=80;
		StringBuffer sbj =new StringBuffer();
		public float salaryj(int x){   //JAVA����ʦӦ�칤�ʵĹ��캯��(��Ҫ����)
			float y;
			y=(float)(34.186*x*x*x-178.54*x*x+1412.3*x+4769.5);
			return y;	
		} 
/*----------------------------------------------------------------------------------------------------
* ���C#����ʦ�������Ӧ����
* ---------------------------------------------------------------------------------------------------*/					
		JButton jbc1=new JButton("ȷ��");	//���c#�������
		JButton jbc12=new JButton("����");		
		JButton jbc11=new JButton("���ݱ���");
		JLabel jlc1=new JLabel("IT����");
		JLabel jlc2=new JLabel("��������");
		JLabel jlc3=new JLabel("ѧϰʱ��");
		JLabel jlc4=new JLabel("���Լ���");		
		JCheckBox jcbc1 = new JCheckBox("Oracle");
		JCheckBox jcbc2 = new JCheckBox("Java");	
		JCheckBox jcbc3 = new JCheckBox("C#");
		JCheckBox jcbc4 = new JCheckBox("Javascript");	
		JCheckBox jcbc5 = new JCheckBox("PHP");	
		JCheckBox jcbc6 = new JCheckBox("Linux");
		JCheckBox jcbc11 = new JCheckBox("Oracle SQL Developer");
		JCheckBox jcbc12 = new JCheckBox("Eclipse");
		JCheckBox jcbc13 = new JCheckBox("Vs2010");
		JCheckBox jcbc14 = new JCheckBox("Firebug");
		JCheckBox jcbc15 = new JCheckBox("Zend Studio");
		JCheckBox jcbc16 = new JCheckBox("Bluefish");		
		Vector vc =new Vector();  
		JComboBox jcbbc=new JComboBox(vc);
		TextArea tac =new TextArea("�������");
		 double Salaryc;
	     double  Salary1c;
	     double  Salary2c;
	     double  Salary3c;
	     double  Salary4c;
	     double  Salary5c;
	     double  Gradesc;
	     double  Grades1c;
	     double  Grades2c;
	     double  Grades3c;
	     double  Grades4c;
	     double  Grades5c;
		//���C#����ʦ��Ҫ����
	    double a1c=286,b1c=8.8*0.5;
		double a2c=247,b2c=7.6*0.5;
		double a3c=377,b3c=11.6*0.5;	
		double a4c=234,b4c=7.2*0.5;
		double a5c=156,b5c=4.80*0.5;
		double bc=80;
		StringBuffer sbc =new StringBuffer();
		public float salaryc(int x){   //JAVA����ʦӦ�칤�ʵĹ��캯��(��Ҫ����)
			float y;
			y=(float)(104.18*x*x*x-380.17*x*x+946.72*x+4753.5);
			return y;	
		} 
/*----------------------------------------------------------------------------------------------------
* ���ios����ʦ�������Ӧ����
* ---------------------------------------------------------------------------------------------------*/		
		JButton jbi1=new JButton("ȷ��");	
		JButton jbi12=new JButton("����");		
		JButton jbi11=new JButton("���ݱ���");
		JLabel jli1=new JLabel("IT����");
		JLabel jli2=new JLabel("��������");
		JLabel jli3=new JLabel("ѧϰʱ��");
		JLabel jli4=new JLabel("���Լ���");		
		JCheckBox jcbi1 = new JCheckBox("Oracle");
		JCheckBox jcbi2 = new JCheckBox("Java");	
		JCheckBox jcbi3 = new JCheckBox("ios");
		JCheckBox jcbi4 = new JCheckBox("PHP");	
		JCheckBox jcbi5 = new JCheckBox("C#");	
		JCheckBox jcbi6 = new JCheckBox("javascript");		
		JCheckBox jcbi11 = new JCheckBox("Oracle SQL Developer");
		JCheckBox jcbi12 = new JCheckBox("Eclipse");
		JCheckBox jcbi13 = new JCheckBox("Xcode");
		JCheckBox jcbi14 = new JCheckBox("Zend Studio");
		JCheckBox jcbi15 = new JCheckBox("Vs2010");
		JCheckBox jcbi16 = new JCheckBox("Firebug");		
		Vector vi =new Vector();  
		JComboBox jcbbi=new JComboBox(vi);
		TextArea tai =new TextArea("�������");
		 double Salaryi;
	     double  Salary1i;
	     double  Salary2i;
	     double  Salary3i;
	     double  Salary4i;
	     double  Salary5i;
	     double  Gradesi;
	     double  Grades1i;
	     double  Grades2i;
	     double  Grades3i;
	     double  Grades4i;
	     double  Grades5i;
	    double a1i=286,b1i=8.8*0.5;
		double a2i=247,b2i=7.6*0.5;
		double a3i=377,b3i=11.6*0.5;	
		double a4i=234,b4i=7.2*0.5;
		double a5i=156,b5i=4.80*0.5;
		double bi=80;
		StringBuffer sbi =new StringBuffer();
		public float salaryi(int x){   
			float y;
			y=(float)(190.46*x*x*x-1129.7*x*x+2318.3*x+4871);
			return y;	
		} 
/*----------------------------------------------------------------------------------------------------
* ���PHP����ʦ�������Ӧ����
* ---------------------------------------------------------------------------------------------------*/	
		JButton jbp1=new JButton("ȷ��");	
		JButton jbp12=new JButton("����");		
		JButton jbp11=new JButton("���ݱ���");
		JLabel jlp1=new JLabel("IT����");
		JLabel jlp2=new JLabel("��������");
		JLabel jlp3=new JLabel("ѧϰʱ��");
		JLabel jlp4=new JLabel("���Լ���");		
		JCheckBox jcbp1 = new JCheckBox("Oracle");
		JCheckBox jcbp2 = new JCheckBox("Javascript");	
		JCheckBox jcbp3 = new JCheckBox("PHP");
		JCheckBox jcbp4 = new JCheckBox("Java");	
		JCheckBox jcbp5 = new JCheckBox("Html5");	
		JCheckBox jcbp6 = new JCheckBox("Jsp");		
		JCheckBox jcbp11 = new JCheckBox("Oracle SQL Developer");
		JCheckBox jcbp12 = new JCheckBox("Zend Studio");
		JCheckBox jcbp13 = new JCheckBox("Dreamweaver");
		JCheckBox jcbp14 = new JCheckBox("Eclipse");
		JCheckBox jcbp15 = new JCheckBox("Initializr");
		JCheckBox jcbp16 = new JCheckBox("Jbuilder");		
		Vector vp =new Vector();  
		JComboBox jcbbp=new JComboBox(vp);
		TextArea tap =new TextArea("�������");
		 double Salaryp;
	     double  Salary1p;
	     double  Salary2p;
	     double  Salary3p;
	     double  Salary4p;
	     double  Salary5p;
	     double  Gradesp;
	     double  Grades1p;
	     double  Grades2p;
	     double  Grades3p;
	     double  Grades4p;
	     double  Grades5p;
	    double a1p=130,b1p=4*0.5;
		double a2p=468,b2p=14.4*0.5;
		double a3p=273,b3p=8.4*0.5;	
		double a4p=195,b4p=6*0.5;
		double a5p=234,b5p=7.2*0.5;
		double bp=80;
		StringBuffer sbp =new StringBuffer();
		public float salaryp(int x){   
			float y;
			y=(float)(25.387*x*x*x - 65.746*x*x + 915.52*x + 4890.1);
			return y;	
		} 
/*----------------------------------------------------------------------------------------------------
* ��Ӱ�׿����ʦ�������Ӧ����
* ---------------------------------------------------------------------------------------------------*/			
		JButton jba1=new JButton("ȷ��");	
		JButton jba12=new JButton("����");		
		JButton jba11=new JButton("���ݱ���");
		JLabel jla1=new JLabel("IT����");
		JLabel jla2=new JLabel("��������");
		JLabel jla3=new JLabel("ѧϰʱ��");
		JLabel jla4=new JLabel("���Լ���");		
		JCheckBox jcba1 = new JCheckBox("Oracle");
		JCheckBox jcba2 = new JCheckBox("Http");	
		JCheckBox jcba3 = new JCheckBox("Java");
		JCheckBox jcba4 = new JCheckBox("Javascript");	
		JCheckBox jcba5 = new JCheckBox("PHP");	
		JCheckBox jcba6 = new JCheckBox("C#");		
		JCheckBox jcba11 = new JCheckBox("Oracle SQL Developer");
		JCheckBox jcba12 = new JCheckBox("HTTP Debugger");
		JCheckBox jcba13 = new JCheckBox("Eclipse ADT");
		JCheckBox jcba14 = new JCheckBox("Firebug");
		JCheckBox jcba15 = new JCheckBox("Zend Studio");
		JCheckBox jcba16 = new JCheckBox("Vs2010");		
		Vector va =new Vector();  
		JComboBox jcbba=new JComboBox(va);
		TextArea taa =new TextArea("�������");
		 double Salarya;
	     double  Salary1a;
	     double  Salary2a;
	     double  Salary3a;
	     double  Salary4a;
	     double  Salary5a;
	     double  Gradesa;
	     double  Grades1a;
	     double  Grades2a;
	     double  Grades3a;
	     double  Grades4a;
	     double  Grades5a;
	    double a1a=260,b1a=8*0.5;
		double a2a=221,b2a=6.8*0.5;
		double a3a=247,b3a=7.6*0.5;	
		double a4a=312,b4a=9.6*0.5;
		double a5a=260,b5a=8*0.5;
		double ba=80;
		StringBuffer sba =new StringBuffer();
		public float salarya(int x){   
			float y;
			y=(float)( 143.97*x*x*x - 778.48*x*x + 1916.3*x + 4679.2);
			return y;	
		} 
/*----------------------------------------------------------------------------------------------------
* �����Ϸ��������ʦ�������Ӧ����
* ---------------------------------------------------------------------------------------------------*/		
		JButton jby1=new JButton("ȷ��");	
		JButton jby12=new JButton("����");		
		JButton jby11=new JButton("���ݱ���");
		JLabel jly1=new JLabel("IT����");
		JLabel jly2=new JLabel("��������");
		JLabel jly3=new JLabel("ѧϰʱ��");
		JLabel jly4=new JLabel("���Լ���");		
		JCheckBox jcby1 = new JCheckBox("Oracle");
		JCheckBox jcby2 = new JCheckBox("Java");	
		JCheckBox jcby3 = new JCheckBox("C#");
		JCheckBox jcby4 = new JCheckBox("Javascript");	
		JCheckBox jcby5 = new JCheckBox("PHP");	
		JCheckBox jcby6 = new JCheckBox("Linux");		
		JCheckBox jcby11 = new JCheckBox("Oracle SQL Developer");
		JCheckBox jcby12 = new JCheckBox("Eclipse");
		JCheckBox jcby13 = new JCheckBox("Unity 3D");
		JCheckBox jcby14 = new JCheckBox("Firebug");
		JCheckBox jcby15 = new JCheckBox("Zend Studio");
		JCheckBox jcby16 = new JCheckBox("Bluefish");		
		Vector vy =new Vector();  
		JComboBox jcbby=new JComboBox(vy);
		TextArea tay =new TextArea("�������");
		 double Salaryy;
	     double  Salary1y;
	     double  Salary2y;
	     double  Salary3y;
	     double  Salary4y;
	     double  Salary5y;
	     double  Gradesy;
	     double  Grades1y;
	     double  Grades2y;
	     double  Grades3y;
	     double  Grades4y;
	     double  Grades5y;
	    double a1y=211.9,b1y=6.52*0.5;
		double a2y=481,b2y=14.8*0.5;
		double a3y=195,b3y=6*0.5;	
		double a4y=221,b4y=6.8*0.5;
		double a5y=191.1,b5y=5.88*0.5;
		double by=80;
		StringBuffer sby =new StringBuffer();
		public float salaryy(int x){   
			float y;
			y=(float)(  166.9*x*x*x - 1007.7*x*x + 2441.5*x + 4829.1);
			return y;	
		} 
/*----------------------------------------------------------------------------------------------------
* �����ҳǰ�˿�������ʦ�������Ӧ����
* ---------------------------------------------------------------------------------------------------*/	
		JButton jbw1=new JButton("ȷ��");	
		JButton jbw12=new JButton("����");		
		JButton jbw11=new JButton("���ݱ���");
		JLabel jlw1=new JLabel("IT����");
		JLabel jlw2=new JLabel("��������");
		JLabel jlw3=new JLabel("ѧϰʱ��");
		JLabel jlw4=new JLabel("���Լ���");		
		JCheckBox jcbw1 = new JCheckBox("Http");
		JCheckBox jcbw2 = new JCheckBox("Java");	
		JCheckBox jcbw3 = new JCheckBox("Jsp");
		JCheckBox jcbw4 = new JCheckBox("Javascript");	
		JCheckBox jcbw5 = new JCheckBox("PHP");	
		JCheckBox jcbw6 = new JCheckBox("Linux");		
		JCheckBox jcbw11 = new JCheckBox("Oracle SQL Developer");
		JCheckBox jcbw12 = new JCheckBox("Initializr");
		JCheckBox jcbw13 = new JCheckBox("Jbuilder");
		JCheckBox jcbw14 = new JCheckBox("Firebug");
		JCheckBox jcbw15 = new JCheckBox("Zend Studio");
		JCheckBox jcbw16 = new JCheckBox("Bluefish");		
		Vector vw =new Vector();  
		JComboBox jcbbw=new JComboBox(vw);
		TextArea taw =new TextArea("�������");
		 double Salaryw;
	     double  Salary1w;
	     double  Salary2w;
	     double  Salary3w;
	     double  Salary4w;
	     double  Salary5w;
	     double  Gradesw;
	     double  Grades1w;
	     double  Grades2w;
	     double  Grades3w;
	     double  Grades4w;
	     double  Grades5w;
	    double a1w=214.5,b1w=6.6*0.5;
		double a2w=312,b2w=9.6*0.5;
		double a3w=351,b3w=10.8*0.5;	
		double a4w=292.5,b4w=9*0.5;
		double a5w=130,b5w=4*0.5;
		double bw=80;
		StringBuffer sbw =new StringBuffer();
		public float salaryw(int x){   
			float y;
			y=(float)(   30.818*x*x*x - 127.56*x*x + 749.23*x + 4690.1);
			return y;	
		} 
		public ABC (){
			this.setLayout(new GridLayout(1,1));
			this.add(jtb);
			//���ѡ�ѡ��
			jtb.add("Java����ʦ",jp1);
			jtb.add("C#����ʦ",jp2);
			jtb.add("ios����ʦ",jp3);
			jtb.add("PHP����ʦ",jp4);
			jtb.add("��׿��������ʦ",jp5);
			jtb.add("��Ϸ��������ʦ",jp6);
			jtb.add("��ҳǰ�˹���ʦ",jp7);	
/*----------------------------------------------------------------------------------------------------
* ���JAVA����ʦ�������
* ---------------------------------------------------------------------------------------------------*/				
			jp1.setLayout(null);  
			jbj1.setBounds(50, 200, 100, 40);
			jp1.add(jbj1); 
			final DecimalFormat dj = new DecimalFormat("######0.00");  
			jbj1.addActionListener(new ActionListener(){ //���JAVAȷ����ť��Ӧ�¼�
				public void actionPerformed(ActionEvent arg0) {
				if(jcbbj.getSelectedItem()=="Ӧ��")
					{
						if(jcbj1.isSelected()&&jcbj11.isSelected()){
						Salary1j=a1j;
						Grades1j=b1j;
						sbj.append("��������Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
					}
					else if(jcbj1.isSelected()){
					
						Salary1j=0.5*a1j;
						Grades1j=0.5*b1j;
						sbj.append("��������Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
					else if((jcbj1.isSelected()==false&&jcbj11.isSelected()==false)||(jcbj1.isSelected()==false&&jcbj11.isSelected())){
						Salary1j=0;
						Grades1j=0;
				
					}					
				     if(jcbj2.isSelected()&&jcbj12.isSelected()){
						Salary2j=a2j;
						Grades2j=b2j;
						sbj.append("��������Mysql���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbj2.isSelected()){
							
							Salary2j=0.5*a2j;
							Grades2j=0.5*b2j;
						sbj.append("��������Mysql���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbj2.isSelected()==false&&jcbj12.isSelected()==false)||(jcbj2.isSelected()==false&&jcbj12.isSelected())){
							Salary2j=0;
							Grades2j=0;
						}				     				    				     
				     if(jcbj4.isSelected()&&jcbj14.isSelected()){
						Salary3j=a3j;
						Grades3j=b3j;
						sbj.append("��������Javascript���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcbj4.isSelected()){
							
							Salary3j=0.5*a3j;
							Grades3j=0.5*b3j;
							sbj.append("��������Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbj4.isSelected()==false&&jcbj14.isSelected()==false)||(jcbj4.isSelected()==false&&jcbj14.isSelected())){
							Salary3j=0;
							Grades3j=0;
						}					     				     				     
				     if(jcbj5.isSelected()&&jcbj15.isSelected()){
						Salary4j=a4j;
						Grades4j=b4j;
						sbj.append("��������Linux���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcbj5.isSelected()){
							
							Salary4j=0.5*a4j;
							Grades4j=0.5*b4j;
							sbj.append("��������Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbj5.isSelected()==false&&jcbj15.isSelected()==false)||(jcbj5.isSelected()==false&&jcbj15.isSelected())){
							Salary4j=0;
							Grades4j=0;
						}					     				     				     				     
				     if(jcbj6.isSelected()&&jcbj16.isSelected()){
						Salary5j=a5j;
						Grades5j=b5j;
						sbj.append("��������Jsp���Ǹ�����ļ��ܣ�\n");
						}
						else if(jcbj6.isSelected()){
								
								Salary5j=0.5*a5j;
								Grades5j=0.5*b5j;
								sbj.append("��������Jsp���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							}
						else if((jcbj6.isSelected()==false&&jcbj16.isSelected()==false)||(jcbj6.isSelected()==false&&jcbj16.isSelected())){
								Salary5j=0;
								Grades5j=0;
							}					     				     				  			     
				     	if(jcbj3.isSelected()&&jcbj13.isSelected()){
							Salaryj=salaryj(0);
							Gradesj=bj;
							sbj.append("����һ���ϸ��JAVA����ʦ����һ�����г�ǰ����\n");
						}
						else if(jcbj3.isSelected()){
								
								Salaryj=0.5*salaryj(0);
								Gradesj=0.5*bj;
							sbj.append("�㻹��һ����ܳ�Ϊһ���ϸ��Java����ʦ��Ҫ������ѧ��ʹ��Eclipse�� �����ˣ�\n");
							}
						else if((jcbj3.isSelected()==false&&jcbj13.isSelected()==false)||(jcbj3.isSelected()==false&&jcbj13.isSelected())){
								Salaryj=0;
								Gradesj=0;
							sbj.append("���Ǹ����ϸ��JAVA����ʦ��\n");
							}

						taj.setText("������"+(float)(Salaryj+Salary1j+Salary2j+Salary3j+Salary4j+Salary5j)+"Ԫ\n"+"���֣�"+dj.format(((Gradesj+Grades1j+Grades2j+Grades3j+Grades4j+Grades5j)*0.8))+"��\n"+sbj);
					}
		
				if(jcbbj.getSelectedItem()=="һ��")
				{
					if(jcbj1.isSelected()&&jcbj11.isSelected()){
					Salary1j=a1j;
					Grades1j=b1j;
					sbj.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
				}
				else if(jcbj1.isSelected()){
				
					Salary1j=0.5*a1j;
					Grades1j=0.5*b1j;
					sbj.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					
				}
				else if((jcbj1.isSelected()==false&&jcbj11.isSelected()==false)||(jcbj1.isSelected()==false&&jcbj11.isSelected())){
					Salary1j=0;
					Grades1j=0;
				}					
			     if(jcbj2.isSelected()&&jcbj12.isSelected()){
					Salary2j=a2j;
					Grades2j=b2j;
					sbj.append("���ܽϺõ�����Mysql���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbj2.isSelected()){
						
						Salary2j=0.5*a2j;
						Grades2j=0.5*b2j;
					sbj.append("���ܽϺõ�����Mysql���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbj2.isSelected()==false&&jcbj12.isSelected()==false)||(jcbj2.isSelected()==false&&jcbj12.isSelected())){
						Salary2j=0;
						Grades2j=0;
					}				     				    				     
			     if(jcbj4.isSelected()&&jcbj14.isSelected()){
					Salary3j=a3j;
					Grades3j=b3j;
					sbj.append("���ܽϺõ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbj4.isSelected()){
						
						Salary3j=0.5*a3j;
						Grades3j=0.5*b3j;
						sbj.append("���ܽϺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbj4.isSelected()==false&&jcbj14.isSelected()==false)||(jcbj4.isSelected()==false&&jcbj14.isSelected())){
						Salary3j=0;
						Grades3j=0;
					}					     				     				     
			     if(jcbj5.isSelected()&&jcbj15.isSelected()){
					Salary4j=a4j;
					Grades4j=b4j;
					sbj.append("���ܽϺõ�����Linux���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbj5.isSelected()){
						
						Salary4j=0.5*a4j;
						Grades4j=0.5*b4j;
						sbj.append("���ܽϺõ�����Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbj5.isSelected()==false&&jcbj15.isSelected()==false)||(jcbj5.isSelected()==false&&jcbj15.isSelected())){
						Salary4j=0;
						Grades4j=0;
					}					     				     				     				     
			     if(jcbj6.isSelected()&&jcbj16.isSelected()){
						Salary5j=a5j;
					    Grades5j=b5j;
					sbj.append("���ܽϺõ�����Jsp���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbj6.isSelected()){
							
							Salary5j=0.5*a5j;
							Grades5j=0.5*b5j;
							sbj.append("���ܽϺõ�����Jsp���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							
						}
					else if((jcbj6.isSelected()==false&&jcbj16.isSelected()==false)||(jcbj6.isSelected()==false&&jcbj16.isSelected())){
							Salary5j=0;
							Grades5j=0;
						}					     				     				  			     
			     	if(jcbj3.isSelected()&&jcbj13.isSelected()){
						Salaryj=salaryj(1);
						Gradesj=bj;
						sbj.append("���Ǹ������JAVA����ʦ!�����г�ǰ����\n");
					}
					else if(jcbj3.isSelected()){
							
							Salaryj=0.5*salaryj(1);
							Gradesj=0.5*bj;
							sbj.append("�㻹��һ����ܳ�Ϊһ�������Java����ʦ��Ҫ������ѧ��ʹ��Eclipse�� �����ˣ�\n");
							
						}
					else if((jcbj3.isSelected()==false&&jcbj13.isSelected()==false)||(jcbj3.isSelected()==false&&jcbj13.isSelected())){
							Salaryj=0;
							Gradesj=0;
							sbj.append("���Ǹ����ϸ��JAVA����ʦ!\n");
						}
					taj.setText("������"+(float)(Salaryj+Salary1j+Salary2j+Salary3j+Salary4j+Salary5j)+"Ԫ\n"+"���֣�"+dj.format((Gradesj+Grades1j+Grades2j+Grades3j+Grades4j+Grades5j)*0.9)+"��\n"+sbj);
				}
		
				if(jcbbj.getSelectedItem()=="����")
				{
					if(jcbj1.isSelected()&&jcbj11.isSelected()){
					Salary1j=a1j;
					Grades1j=b1j;
					sbj.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbj1.isSelected()){
				
					Salary1j=0.5*a1j;
					Grades1j=0.5*b1j;
					sbj.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcbj1.isSelected()==false&&jcbj11.isSelected()==false)||(jcbj1.isSelected()==false&&jcbj11.isSelected())){
					Salary1j=0;
					Grades1j=0;
				}					
			     if(jcbj2.isSelected()&&jcbj12.isSelected()){
					Salary2j=a2j;
					Grades2j=b2j;
					sbj.append("���ܺܺõ�����Mysql���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbj2.isSelected()){
						
						Salary2j=0.5*a2j;
						Grades2j=0.5*b2j;
						sbj.append("���ܺܺõ�����Mysql���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbj2.isSelected()==false&&jcbj12.isSelected()==false)||(jcbj2.isSelected()==false&&jcbj12.isSelected())){
						Salary2j=0;
						Grades2j=0;
					}				     				    				     
			     if(jcbj4.isSelected()&&jcbj14.isSelected()){
					Salary3j=a3j;
					Grades3j=b3j;
					sbj.append("���ܺܺõ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbj4.isSelected()){
						
						Salary3j=0.5*a3j;
						Grades3j=0.5*b3j;
						sbj.append("���ܺܺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbj4.isSelected()==false&&jcbj14.isSelected()==false)||(jcbj4.isSelected()==false&&jcbj14.isSelected())){
						Salary3j=0;
						Grades3j=0;
					}					     				     				     
			     if(jcbj5.isSelected()&&jcbj15.isSelected()){
					Salary4j=a4j;
					Grades4j=b4j;
					sbj.append("���ܺܺõ�����Linux���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbj5.isSelected()){
						
						Salary4j=0.5*a4j;
						Grades4j=0.5*b4j;
						sbj.append("���ܺܺõ�����Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbj5.isSelected()==false&&jcbj15.isSelected()==false)||(jcbj5.isSelected()==false&&jcbj15.isSelected())){
						Salary4j=0;
						Grades4j=0;
					}					     				     				     				     
			     if(jcbj6.isSelected()&&jcbj16.isSelected()){
					Salary5j=a5j;
					Grades5j=b5j;
					sbj.append("���ܺܺõ�����Jsp���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbj6.isSelected()){
							
							Salary5j=0.5*a5j;
							Grades5j=0.5*b5j;
							sbj.append("���ܺܺõ�����Jsp���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbj6.isSelected()==false&&jcbj16.isSelected()==false)||(jcbj6.isSelected()==false&&jcbj16.isSelected())){
							Salary5j=0;
							Grades5j=0;
						}					     				     				  			     
			     	if(jcbj3.isSelected()&&jcbj13.isSelected()){
						Salaryj=salaryj(4);
						Gradesj=bj;
						sbj.append("����һ�������JAVA����ʦ���ǳ����г�ǰ����\n");
					}
					else if(jcbj3.isSelected()){
							
							Salaryj=0.5*salaryj(4);
							Gradesj=0.5*bj;
							sbj.append("�㻹��һ����ܳ�Ϊһ�������Java����ʦ��Ҫ������ѧ��ʹ��Eclipse�� �����ˣ�\n");
						}
					else if((jcbj3.isSelected()==false&&jcbj13.isSelected()==false)||(jcbj3.isSelected()==false&&jcbj13.isSelected())){
							Salaryj=0;
							Gradesj=0;
							sbj.append("���Ǹ����ϸ��JAVA����ʦ!\n");
						}
					taj.setText("������"+(float)(Salaryj+Salary1j+Salary2j+Salary3j+Salary4j+Salary5j)+"Ԫ\n"+"���֣�"+dj.format((Gradesj+Grades1j+Grades2j+Grades3j+Grades4j+Grades5j)*0.95)+"��\n"+sbj);
				}
		
				if(jcbbj.getSelectedItem()=="����")
				{
					if(jcbj1.isSelected()&&jcbj11.isSelected()){
					Salary1j=a1j;
					Grades1j=b1j;
					sbj.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbj1.isSelected()){
				
					Salary1j=0.5*a1j;
					Grades1j=0.5*b1j;
					sbj.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcbj1.isSelected()==false&&jcbj11.isSelected()==false)||(jcbj1.isSelected()==false&&jcbj11.isSelected())){
					Salary1j=0;
					Grades1j=0;
				}					
			     if(jcbj2.isSelected()&&jcbj12.isSelected()){
					Salary2j=a2j;
					Grades2j=b2j;
					sbj.append("���ܷǳ��õ�����Mysql���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbj2.isSelected()){
						
						Salary2j=0.5*a2j;
						Grades2j=0.5*b2j;
						sbj.append("���ܷǳ��õ�����Mysql���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbj2.isSelected()==false&&jcbj12.isSelected()==false)||(jcbj2.isSelected()==false&&jcbj12.isSelected())){
						Salary2j=0;
						Grades2j=0;
					}				     				    				     
			     if(jcbj4.isSelected()&&jcbj14.isSelected()){
					Salary3j=a3j;
					Grades3j=b3j;
					sbj.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbj4.isSelected()){
						
						Salary3j=0.5*a3j;
						Grades3j=0.5*b3j;
						sbj.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbj4.isSelected()==false&&jcbj14.isSelected()==false)||(jcbj4.isSelected()==false&&jcbj14.isSelected())){
						Salary3j=0;
						Grades3j=0;
					}					     				     				     
			     if(jcbj5.isSelected()&&jcbj15.isSelected()){
					Salary4j=a4j;
					Grades4j=b4j;
					sbj.append("���ܷǳ��õ�����Linux���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbj5.isSelected()){
						
						Salary4j=0.5*a4j;
						Grades4j=0.5*b4j;
						sbj.append("���ܷǳ��õ�����Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbj5.isSelected()==false&&jcbj15.isSelected()==false)||(jcbj5.isSelected()==false&&jcbj15.isSelected())){
						Salary4j=0;
						Grades4j=0;
					}					     				     				     				     
			     if(jcbj6.isSelected()&&jcbj16.isSelected()){
						Salary5j=a5j;
					    Grades5j=b5j;
						sbj.append("���ܷǳ��õ�����Jsp���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbj6.isSelected()){
							
							Salary5j=0.5*a5j;
							Grades5j=0.5*b5j;
							sbj.append("���ܷǳ��õ�����Jsp���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbj6.isSelected()==false&&jcbj16.isSelected()==false)||(jcbj6.isSelected()==false&&jcbj16.isSelected())){
							Salary5j=0;
							Grades5j=0;
						}					     				     				  			     
			     	if(jcbj3.isSelected()&&jcbj13.isSelected()){
						Salaryj=salaryj(6);
						Gradesj=bj;
						sbj.append("����һ���ǳ������JAVA����ʦ!�ǳ����г�ǰ����\n");
					}
					else if(jcbj3.isSelected()){
							
							Salaryj=0.5*salaryj(6);
							Gradesj=0.5*bj;
							sbj.append("�㻹��һ����ܳ�Ϊһ���ǳ�����Ĺ���ʦ��Ҫ������ѧ��ʹ��Eclipse�� �����ˣ�\n");
						}
					else if((jcbj3.isSelected()==false&&jcbj13.isSelected()==false)||(jcbj3.isSelected()==false&&jcbj13.isSelected())){
							Salaryj=0;
							Gradesj=0;
							sbj.append("���Ǹ����ϸ��JAVA����ʦ!\n");
						}
					taj.setText("������"+(float)(Salaryj+Salary1j+Salary2j+Salary3j+Salary4j+Salary5j)+"Ԫ\n"+"���֣�"+dj.format((Gradesj+Grades1j+Grades2j+Grades3j+Grades4j+Grades5j))+"��\n"+sbj);
				}
				}
			});
			//���JAVA���ð�ť��Ӧ�¼�
			jbj12.setBounds(50, 260, 100, 40);
			jp1.add(jbj12); 
			jbj12.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent arg0) {
					taj.setText("");
					jcbj1.setSelected(false);
					jcbj2.setSelected(false);
					jcbj3.setSelected(false);
					jcbj4.setSelected(false);
					jcbj5.setSelected(false);
					jcbj6.setSelected(false);
					jcbj11.setSelected(false);
					jcbj12.setSelected(false);
					jcbj13.setSelected(false);
					jcbj14.setSelected(false);
					jcbj15.setSelected(false);
					jcbj16.setSelected(false);
					Salary1j=0;
					Salary2j=0;
					Salary3j=0;
					Salary4j=0;
					Salary5j=0;
					Grades1j=0;
					Grades2j=0;
					Grades3j=0;
					Grades4j=0;
					Grades5j=0;
					sbj.delete(0, 10000);
				}
				
			});
			//���JAVA������������λ�ô�С
			jlj1.setBounds(20, 20, 60, 40);
			jp1.add(jlj1);
			jcbj1.setBounds(80, 20, 80, 40);
			jp1.add(jcbj1);
			jcbj2.setBounds(80+80, 20, 80, 40);
			jp1.add(jcbj2);
			jcbj3.setBounds(80+2*80, 20, 80, 40);
			jp1.add(jcbj3);
			jcbj4.setBounds(80+3*80, 20, 80, 40);
			jp1.add(jcbj4);
			jcbj5.setBounds(80+4*87, 20, 80, 40);
			jp1.add(jcbj5);
			jcbj6.setBounds(80+5*87, 20, 80, 40);
			jp1.add(jcbj6);
			jlj2.setBounds(20, 60, 60, 40);
			jp1.add(jlj2);
			jcbj11.setBounds(80, 60, 150, 40);
			jp1.add(jcbj11);
			jcbj12.setBounds(600, 60, 130, 40);
			jp1.add(jcbj12);
			jcbj13.setBounds(240, 60, 80, 40);
			jp1.add(jcbj13);
			jcbj14.setBounds(320, 60, 80, 40);
			jp1.add(jcbj14);
			jcbj15.setBounds(428, 60, 80, 40);
			jp1.add(jcbj15);
			jcbj16.setBounds(515, 60, 80, 40);
			jp1.add(jcbj16);
			jlj3.setBounds(20, 130, 60, 40);
			jp1.add(jlj3);
			jcbbj.setBounds(80, 130, 70, 30);
			jp1.add(jcbbj);
			vj.add("Ӧ��");
			vj.add("һ��");
			vj.add("����");
			vj.add("����");
			taj.setBounds(200, 120, 520, 260);
			jp1.add(taj);
			Font fj =new Font("����",Font.PLAIN,16);	//����������ʽ
			taj.setFont(fj);
			taj.setEditable(false);
			//������ݱ��ݰ�ť
			jbj11.setBounds(50, 320, 100, 40);
			jp1.add(jbj11);
			jbj11.addActionListener(new ActionListener(){   //����java����ʦ���ݱ�����Ϣ
				public void actionPerformed(ActionEvent arg0) {
					try{
						File f=new File("JAVA����ʦ����.txt");
						f.createNewFile();
						FileOutputStream f1=new FileOutputStream("JAVA����ʦ����.txt");
						 byte[] b=new byte[1024];
			             String str=taj.getText().toString();
			             b=str.getBytes();
						f1.write(b);  					
						f1.close();
						JOptionPane.showMessageDialog(null, "�������ݳɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
					}
					catch(IOException e){
					JOptionPane.showMessageDialog(null, "�������ݲ��ɹ���", "��ʾ", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			});
			
/*----------------------------------------------------------------------------------------------------
 * ���C#����ʦ�������
 * ---------------------------------------------------------------------------------------------------*/			
			jp2.setLayout(null);  
			jbc1.setBounds(50, 200, 100, 40);
			jp2.add(jbc1); 
			final DecimalFormat dc = new DecimalFormat("######0.00");  
			jbc1.addActionListener(new ActionListener(){   //���C#ȷ����ť��Ӧ�¼�
				public void actionPerformed(ActionEvent arg0) {
				if(jcbbc.getSelectedItem()=="Ӧ��")
					{
						if(jcbc1.isSelected()&&jcbc11.isSelected()){
						Salary1c=a1c;
						Grades1c=b1c;
						sbc.append("��������Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
					}
					else if(jcbc1.isSelected()){
					
						Salary1c=0.5*a1c;
						Grades1c=0.5*b1c;
						sbc.append("��������Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
					else if((jcbc1.isSelected()==false&&jcbc11.isSelected()==false)||(jcbc1.isSelected()==false&&jcbc11.isSelected())){
						Salary1c=0;
						Grades1c=0;
				
					}					
				     if(jcbc2.isSelected()&&jcbc12.isSelected()){
						Salary2c=a2c;
						Grades2c=b2c;
						sbc.append("��������Java���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbc2.isSelected()){
							
							Salary2c=0.5*a2c;
							Grades2c=0.5*b2c;
						sbc.append("��������Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbc2.isSelected()==false&&jcbc12.isSelected()==false)||(jcbc2.isSelected()==false&&jcbc12.isSelected())){
							Salary2c=0;
							Grades2c=0;
						}				     				    				     
				     if(jcbc4.isSelected()&&jcbc14.isSelected()){
						Salary3c=a3c;
						Grades3c=b3c;
						sbc.append("��������Javascript���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcbc4.isSelected()){
							
							Salary3c=0.5*a3c;
							Grades3c=0.5*b3c;
							sbc.append("��������Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbc4.isSelected()==false&&jcbc14.isSelected()==false)||(jcbc4.isSelected()==false&&jcbc14.isSelected())){
							Salary3c=0;
							Grades3c=0;
						}					     				     				     
				     if(jcbc5.isSelected()&&jcbc15.isSelected()){
						Salary4c=a4c;
						Grades4c=b4c;
						sbc.append("��������PHP���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcbc5.isSelected()){
							
							Salary4c=0.5*a4c;
							Grades4c=0.5*b4c;
							sbc.append("��������PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbc5.isSelected()==false&&jcbc15.isSelected()==false)||(jcbc5.isSelected()==false&&jcbc15.isSelected())){
							Salary4c=0;
							Grades4c=0;
						}					     				     				     				     
				     if(jcbc6.isSelected()&&jcbc16.isSelected()){
						Salary5c=a5c;
						Grades5c=b5c;
						sbc.append("��������Linux���Ǹ�����ļ��ܣ�\n");
						}
						else if(jcbc6.isSelected()){
								
								Salary5c=0.5*a5c;
								Grades5c=0.5*b5c;
								sbc.append("��������Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							}
						else if((jcbc6.isSelected()==false&&jcbc16.isSelected()==false)||(jcbc6.isSelected()==false&&jcbc16.isSelected())){
								Salary5c=0;
								Grades5c=0;
							}					     				     				  			     
				     	if(jcbc3.isSelected()&&jcbc13.isSelected()){
							Salaryc=salaryc(0);
							Gradesc=bc;
							sbc.append("����һ���ϸ��C#����ʦ����һ�����г�ǰ����\n");
						}
						else if(jcbc3.isSelected()){
								
								Salaryc=0.5*salaryc(0);
								Gradesc=0.5*bc;
							sbc.append("�㻹��һ����ܳ�Ϊһ���ϸ��C#����ʦ��Ҫ������ѧ��ʹ��Vs2010�� �����ˣ�\n");
							}
						else if((jcbc3.isSelected()==false&&jcbc13.isSelected()==false)||(jcbc3.isSelected()==false&&jcbc13.isSelected())){
								Salaryc=0;
								Gradesc=0;
							sbc.append("���Ǹ����ϸ��C#����ʦ��\n");
							}

						tac.setText("������"+(float)(Salaryc+Salary1c+Salary2c+Salary3c+Salary4c+Salary5c)+"Ԫ\n"+"���֣�"+dc.format((Gradesc+Grades1c+Grades2c+Grades3c+Grades4c+Grades5c)*0.8)+"��\n"+sbc);
					}

				if(jcbbc.getSelectedItem()=="һ��")
				{
					if(jcbc1.isSelected()&&jcbc11.isSelected()){
					Salary1c=a1c;
					Grades1c=b1c;
					sbc.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
				}
				else if(jcbc1.isSelected()){
				
					Salary1c=0.5*a1c;
					Grades1c=0.5*b1c;
					sbc.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					
				}
				else if((jcbc1.isSelected()==false&&jcbc11.isSelected()==false)||(jcbc1.isSelected()==false&&jcbc11.isSelected())){
					Salary1c=0;
					Grades1c=0;
				}					
			     if(jcbc2.isSelected()&&jcbc12.isSelected()){
					Salary2c=a2c;
					Grades2c=b2c;
					sbc.append("���ܽϺõ�����Java���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbc2.isSelected()){
							
							Salary2c=0.5*a2c;
							Grades2c=0.5*b2c;
						sbc.append("���ܽϺõ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
				else if((jcbc2.isSelected()==false&&jcbc12.isSelected()==false)||(jcbc2.isSelected()==false&&jcbc12.isSelected())){
						Salary2c=0;
						Grades2c=0;
					}				     				    				     
			     if(jcbc4.isSelected()&&jcbc14.isSelected()){
					Salary3c=a3c;
					Grades3c=b3c;
					sbc.append("���ܽϺõ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbc4.isSelected()){
						
						Salary3c=0.5*a3c;
						Grades3c=0.5*b3c;
						sbc.append("���ܽϺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbc4.isSelected()==false&&jcbc14.isSelected()==false)||(jcbc4.isSelected()==false&&jcbc14.isSelected())){
						Salary3c=0;
						Grades3c=0;
					}					     				     				     
			     if(jcbc5.isSelected()&&jcbc15.isSelected()){
						Salary4c=a4c;
						Grades4c=b4c;
						sbc.append("���ܽϺõ�����PHP���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbc5.isSelected()){
							
							Salary4c=0.5*a4c;
							Grades4c=0.5*b4c;
							sbc.append("���ܽϺõ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}			  
				else if((jcbc5.isSelected()==false&&jcbc15.isSelected()==false)||(jcbc5.isSelected()==false&&jcbc15.isSelected())){
						Salary4c=0;
						Grades4c=0;
					}					     				     				     				     
			     if(jcbc6.isSelected()&&jcbc16.isSelected()){
						Salary5c=a5c;
					    Grades5c=b5c;
					sbc.append("���ܽϺõ�����Linux���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbc6.isSelected()){
							
							Salary5c=0.5*a5c;
							Grades5c=0.5*b5c;
							sbc.append("���ܽϺõ�����Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							
						}
					else if((jcbc6.isSelected()==false&&jcbc16.isSelected()==false)||(jcbc6.isSelected()==false&&jcbc16.isSelected())){
							Salary5c=0;
							Grades5c=0;
						}					     				     				  			     
			     	if(jcbc3.isSelected()&&jcbc13.isSelected()){
						Salaryc=salaryc(1);
						Gradesc=bc;
						sbc.append("���Ǹ������C#����ʦ!�����г�ǰ����\n");
					}
					else if(jcbc3.isSelected()){
							
							Salaryc=0.5*salaryc(1);
							Gradesc=0.5*bc;
							sbc.append("�㻹��һ����ܳ�Ϊһ�������C#����ʦ��Ҫ������ѧ��ʹ��Vs2010�� �����ˣ�\n");
							
						}
					else if((jcbc3.isSelected()==false&&jcbc13.isSelected()==false)||(jcbc3.isSelected()==false&&jcbc13.isSelected())){
							Salaryc=0;
							Gradesc=0;
							sbc.append("���Ǹ����ϸ��C#����ʦ!\n");
						}
					tac.setText("������"+(float)(Salaryc+Salary1c+Salary2c+Salary3c+Salary4c+Salary5c)+"Ԫ\n"+"���֣�"+dc.format((Gradesc+Grades1c+Grades2c+Grades3c+Grades4c+Grades5c)*0.9)+"��\n"+sbc);
				}

				if(jcbbc.getSelectedItem()=="����")
				{
					if(jcbc1.isSelected()&&jcbc11.isSelected()){
					Salary1c=a1c;
					Grades1c=b1c;
					sbc.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbc1.isSelected()){
				
					Salary1c=0.5*a1c;
					Grades1c=0.5*b1c;
					sbc.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcbc1.isSelected()==false&&jcbc11.isSelected()==false)||(jcbc1.isSelected()==false&&jcbc11.isSelected())){
					Salary1c=0;
					Grades1c=0;
				}					
			     if(jcbc2.isSelected()&&jcbc12.isSelected()){
					Salary2c=a2c;
					Grades2c=b2c;
					sbc.append("���ܺܺõ�����Java���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbc2.isSelected()){
						
						Salary2c=0.5*a2c;
						Grades2c=0.5*b2c;
						sbc.append("���ܺܺõ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbc2.isSelected()==false&&jcbc12.isSelected()==false)||(jcbc2.isSelected()==false&&jcbc12.isSelected())){
						Salary2c=0;
						Grades2c=0;
					}				     				    				     
			     if(jcbc4.isSelected()&&jcbc14.isSelected()){
					Salary3c=a3c;
					Grades3c=b3c;
					sbc.append("���ܺܺõ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbc4.isSelected()){
						
						Salary3c=0.5*a3c;
						Grades3c=0.5*b3c;
						sbc.append("���ܺܺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbc4.isSelected()==false&&jcbc14.isSelected()==false)||(jcbc4.isSelected()==false&&jcbc14.isSelected())){
						Salary3c=0;
						Grades3c=0;
					}					     				     				     
			     if(jcbc5.isSelected()&&jcbc15.isSelected()){
					Salary4c=a4c;
					Grades4c=b4c;
					sbc.append("���ܺܺõ�����PHP���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbc5.isSelected()){
						
						Salary4c=0.5*a4c;
						Grades4c=0.5*b4c;
						sbc.append("���ܺܺõ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbc5.isSelected()==false&&jcbc15.isSelected()==false)||(jcbc5.isSelected()==false&&jcbc15.isSelected())){
						Salary4c=0;
						Grades4c=0;
					}					     				     				     				     
			     if(jcbc6.isSelected()&&jcbc16.isSelected()){
					Salary5c=a5c;
					Grades5c=b5c;
					sbc.append("���ܺܺõ�����Linux���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbc6.isSelected()){
							
							Salary5c=0.5*a5c;
							Grades5c=0.5*b5c;
							sbc.append("���ܺܺõ�����Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbc6.isSelected()==false&&jcbc16.isSelected()==false)||(jcbc6.isSelected()==false&&jcbc16.isSelected())){
							Salary5c=0;
							Grades5c=0;
						}					     				     				  			     
			     	if(jcbc3.isSelected()&&jcbc13.isSelected()){
						Salaryc=salaryc(4);
						Gradesc=bc;
						sbc.append("����һ�������C#����ʦ���ǳ����г�ǰ����\n");
					}
					else if(jcbc3.isSelected()){
							
							Salaryc=0.5*salaryc(4);
							Gradesc=0.5*bc;
							sbc.append("�㻹��һ����ܳ�Ϊһ�������C#����ʦ��Ҫ������ѧ��ʹ��Vs2010�� �����ˣ�\n");
						}
					else if((jcbc3.isSelected()==false&&jcbc13.isSelected()==false)||(jcbc3.isSelected()==false&&jcbc13.isSelected())){
							Salaryc=0;
							Gradesc=0;
							sbc.append("���Ǹ����ϸ��C#����ʦ!\n");
						}
					tac.setText("������"+(float)(Salaryc+Salary1c+Salary2c+Salary3c+Salary4c+Salary5c)+"Ԫ\n"+"���֣�"+dc.format((Gradesc+Grades1c+Grades2c+Grades3c+Grades4c+Grades5c)*0.95)+"��\n"+sbc);
				}
				
				
				if(jcbbc.getSelectedItem()=="����")
				{
					if(jcbc1.isSelected()&&jcbc11.isSelected()){
					Salary1c=a1c;
					Grades1c=b1c;
					sbc.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbc1.isSelected()){
				
					Salary1c=0.5*a1c;
					Grades1c=0.5*b1c;
					sbc.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcbc1.isSelected()==false&&jcbc11.isSelected()==false)||(jcbc1.isSelected()==false&&jcbc11.isSelected())){
					Salary1c=0;
					Grades1c=0;
				}					
			     if(jcbc2.isSelected()&&jcbc12.isSelected()){
					Salary2c=a2c;
					Grades2c=b2c;
					sbc.append("���ܷǳ��õ�����Java���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbc2.isSelected()){
						
						Salary2c=0.5*a2c;
						Grades2c=0.5*b2c;
						sbc.append("���ܷǳ��õ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbc2.isSelected()==false&&jcbc12.isSelected()==false)||(jcbc2.isSelected()==false&&jcbc12.isSelected())){
						Salary2c=0;
						Grades2c=0;
					}				     				    				     
			     if(jcbc4.isSelected()&&jcbc14.isSelected()){
					Salary3c=a3c;
					Grades3c=b3c;
					sbc.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbc4.isSelected()){
						
						Salary3c=0.5*a3c;
						Grades3c=0.5*b3c;
						sbc.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbc4.isSelected()==false&&jcbc14.isSelected()==false)||(jcbc4.isSelected()==false&&jcbc14.isSelected())){
						Salary3c=0;
						Grades3c=0;
					}					     				     				     
			     if(jcbc5.isSelected()&&jcbc15.isSelected()){
					Salary4c=a4c;
					Grades4c=b4c;
					sbc.append("���ܷǳ��õ�����PHP���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbc5.isSelected()){
						
						Salary4c=0.5*a4c;
						Grades4c=0.5*b4c;
						sbc.append("���ܷǳ��õ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbc5.isSelected()==false&&jcbc15.isSelected()==false)||(jcbc5.isSelected()==false&&jcbc15.isSelected())){
						Salary4c=0;
						Grades4c=0;
					}					     				     				     				     
			     if(jcbc6.isSelected()&&jcbc16.isSelected()){
						Salary5c=a5c;
					    Grades5c=b5c;
						sbc.append("���ܷǳ��õ�����Linux���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbc6.isSelected()){
							
							Salary5c=0.5*a5c;
							Grades5c=0.5*b5c;
							sbc.append("���ܷǳ��õ�����Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbc6.isSelected()==false&&jcbc16.isSelected()==false)||(jcbc6.isSelected()==false&&jcbc16.isSelected())){
							Salary5c=0;
							Grades5c=0;
						}					     				     				  			     
			     	if(jcbc3.isSelected()&&jcbc13.isSelected()){
						Salaryc=salaryc(6);
						Gradesc=bc;
						sbc.append("����һ���ǳ������C#����ʦ!�ǳ����г�ǰ����\n");
					}
					else if(jcbc3.isSelected()){
							
							Salaryc=0.5*salaryc(6);
							Gradesc=0.5*bc;
							sbc.append("�㻹��һ����ܳ�Ϊһ���ǳ������C#����ʦ��Ҫ������ѧ��ʹ��Vs2010�� �����ˣ�\n");
						}
					else if((jcbc3.isSelected()==false&&jcbc13.isSelected()==false)||(jcbc3.isSelected()==false&&jcbc13.isSelected())){
							Salaryc=0;
							Gradesc=0;
							sbc.append("���Ǹ����ϸ��C#����ʦ!\n");
						}
					tac.setText("������"+(float)(Salaryc+Salary1c+Salary2c+Salary3c+Salary4c+Salary5c)+"Ԫ\n"+"���֣�"+dc.format((Gradesc+Grades1c+Grades2c+Grades3c+Grades4c+Grades5c))+"��\n"+sbc);
				}
				}
			});
			//������ð�ť
			jbc12.setBounds(50, 260, 100, 40);
			jp2.add(jbc12); 
			jbc12.addActionListener(new ActionListener(){  //����C#���ð�ť��Ӧ�¼�
				public void actionPerformed(ActionEvent arg0) {
					tac.setText("");
					jcbc1.setSelected(false);
					jcbc2.setSelected(false);
					jcbc3.setSelected(false);
					jcbc4.setSelected(false);
					jcbc5.setSelected(false);
					jcbc6.setSelected(false);
					jcbc11.setSelected(false);
					jcbc12.setSelected(false);
					jcbc13.setSelected(false);
					jcbc14.setSelected(false);
					jcbc15.setSelected(false);
					jcbc16.setSelected(false);
					Salary1c=0;
					Salary2c=0;
					Salary3c=0;
					Salary4c=0;
					Salary5c=0;
					Grades1c=0;
					Grades2c=0;
					Grades3c=0;
					Grades4c=0;
					Grades5c=0;
					sbc.delete(0, 10000);
				}
				
			});
			jlc1.setBounds(20, 20, 60, 40);
			jp2.add(jlc1);
			jcbc1.setBounds(80, 20, 80, 40);
			jp2.add(jcbc1);
			jcbc2.setBounds(80+80, 20, 80, 40);
			jp2.add(jcbc2);
			jcbc3.setBounds(80+2*80, 20, 80, 40);
			jp2.add(jcbc3);
			jcbc4.setBounds(80+3*80, 20, 80, 40);
			jp2.add(jcbc4);
			jcbc5.setBounds(80+4*87, 20, 80, 40);
			jp2.add(jcbc5);
			jcbc6.setBounds(80+5*87, 20, 80, 40);
			jp2.add(jcbc6);
			jlc2.setBounds(20, 60, 60, 40);
			jp2.add(jlc2);
			jcbc11.setBounds(80, 60, 150, 40);
			jp2.add(jcbc11);
			jcbc12.setBounds(428, 60, 80, 40);
			jp2.add(jcbc12);
			jcbc13.setBounds(240, 60, 80, 40);
			jp2.add(jcbc13);
			jcbc14.setBounds(320, 60, 80, 40);
			jp2.add(jcbc14);
			jcbc15.setBounds(600, 60, 130, 40);
			jp2.add(jcbc15);
			jcbc16.setBounds(515, 60, 80, 40);
			jp2.add(jcbc16);
			jlc3.setBounds(20, 130, 60, 40);
			jp2.add(jlc3);
			jcbbc.setBounds(80, 130, 70, 30);
			jp2.add(jcbbc);
			vc.add("Ӧ��");
			vc.add("һ��");
			vc.add("����");
			vc.add("����");
			tac.setBounds(200, 120, 520, 260);
			jp2.add(tac);
			Font fc =new Font("����",Font.PLAIN,16);	
			tac.setFont(fc);
			tac.setEditable(false);
			jbc11.setBounds(50, 320, 100, 40);
			jp2.add(jbc11);	
			jbc11.addActionListener(new ActionListener(){//C#����ʦ���ݱ���

				public void actionPerformed(ActionEvent arg0) {
					try{
						File f=new File("C#����ʦ����.txt");
						f.createNewFile();
						FileOutputStream f1=new FileOutputStream("C#����ʦ����.txt");
						 byte[] b=new byte[1024];
			             String str=tac.getText().toString();
			             b=str.getBytes();
						f1.write(b);  
						f1.close();
						JOptionPane.showMessageDialog(null, "�������ݳɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
					}
					catch(IOException e){
					JOptionPane.showMessageDialog(null, "�������ݲ��ɹ���", "��ʾ", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			});
/*----------------------------------------------------------------------------------------------------
* ���ios����ʦ�������
* ---------------------------------------------------------------------------------------------------*/				
			jp3.setLayout(null);  
			jbi1.setBounds(50, 200, 100, 40);
			jp3.add(jbi1); 
			final DecimalFormat  di  = new DecimalFormat("######0.00");   
			jbi1.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent arg0) {
				if(jcbbi.getSelectedItem()=="Ӧ��")
					{
						if(jcbi1.isSelected()&&jcbi11.isSelected()){
						Salary1i=a1i;
						Grades1i=b1i;
						sbi.append("��������Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
					}
					else if(jcbi1.isSelected()){
					
						Salary1i=0.5*a1i;
						Grades1i=0.5*b1i;
						sbi.append("��������Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
					else if((jcbi1.isSelected()==false&&jcbi11.isSelected()==false)||(jcbi1.isSelected()==false&&jcbi11.isSelected())){
						Salary1i=0;
						Grades1i=0;
				
					}					
				     if(jcbi2.isSelected()&&jcbi12.isSelected()){
						Salary2i=a2i;
						Grades2i=b2i;
						sbi.append("��������Java���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbi2.isSelected()){
							
							Salary2i=0.5*a2i;
							Grades2i=0.5*b2i;
						sbi.append("��������Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbi2.isSelected()==false&&jcbi12.isSelected()==false)||(jcbi2.isSelected()==false&&jcbi12.isSelected())){
							Salary2i=0;
							Grades2i=0;
						}				     				    				     
				     if(jcbi4.isSelected()&&jcbi14.isSelected()){
						Salary3i=a3i;
						Grades3i=b3i;
						sbi.append("��������PHP���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcbi4.isSelected()){
							
							Salary3i=0.5*a3i;
							Grades3i=0.5*b3i;
							sbi.append("��������PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbi4.isSelected()==false&&jcbi14.isSelected()==false)||(jcbi4.isSelected()==false&&jcbi14.isSelected())){
							Salary3i=0;
							Grades3i=0;
						}					     				     				     
				     if(jcbi5.isSelected()&&jcbi15.isSelected()){
						Salary4i=a4i;
						Grades4i=b4i;
						sbi.append("��������C#���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcbi5.isSelected()){
							
							Salary4i=0.5*a4i;
							Grades4i=0.5*b4i;
							sbi.append("��������C#���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbi5.isSelected()==false&&jcbi15.isSelected()==false)||(jcbi5.isSelected()==false&&jcbi15.isSelected())){
							Salary4i=0;
							Grades4i=0;
						}					     				     				     				     
				     if(jcbi6.isSelected()&&jcbi16.isSelected()){
						Salary5i=a5i;
						Grades5i=b5i;
						sbi.append("��������javascript���Ǹ�����ļ��ܣ�\n");
						}
						else if(jcbi6.isSelected()){
								
								Salary5i=0.5*a5i;
								Grades5i=0.5*b5i;
								sbi.append("��������javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							}
						else if((jcbi6.isSelected()==false&&jcbi16.isSelected()==false)||(jcbi6.isSelected()==false&&jcbi16.isSelected())){
								Salary5i=0;
								Grades5i=0;
							}					     				     				  			     
				     	if(jcbi3.isSelected()&&jcbi13.isSelected()){
							Salaryi=salaryi(0);
							Gradesi=bi;
							sbi.append("����һ���ϸ��ios����ʦ����һ�����г�ǰ����\n");
						}
						else if(jcbi3.isSelected()){
								
								Salaryi=0.5*salaryi(0);
								Gradesi=0.5*bi;
							sbi.append("�㻹��һ����ܳ�Ϊһ���ϸ��ios����ʦ��Ҫ������ѧ��ʹ��Xcode�� �����ˣ�\n");
							}
						else if((jcbi3.isSelected()==false&&jcbi13.isSelected()==false)||(jcbi3.isSelected()==false&&jcbi13.isSelected())){
								Salaryi=0;
								Gradesi=0;
							sbi.append("���Ǹ����ϸ��ios����ʦ��\n");
							}

						tai.setText("������"+(float)(Salaryi+Salary1i+Salary2i+Salary3i+Salary4i+Salary5i)+"Ԫ\n"+"���֣�"+di.format((Gradesi+Grades1i+Grades2i+Grades3i+Grades4i+Grades5i)*0.8)+"��\n"+sbi);
					}

				if(jcbbi.getSelectedItem()=="һ��")
				{
					if(jcbi1.isSelected()&&jcbi11.isSelected()){
					Salary1i=a1i;
					Grades1i=b1i;
					sbi.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
				}
				else if(jcbi1.isSelected()){
				
					Salary1i=0.5*a1i;
					Grades1i=0.5*b1i;
					sbi.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					
				}
				else if((jcbi1.isSelected()==false&&jcbi11.isSelected()==false)||(jcbi1.isSelected()==false&&jcbi11.isSelected())){
					Salary1i=0;
					Grades1i=0;
				}					
			     if(jcbi2.isSelected()&&jcbi12.isSelected()){
					Salary2i=a2i;
					Grades2i=b2i;
					sbi.append("���ܽϺõ�����Java���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbi2.isSelected()){
							
							Salary2i=0.5*a2i;
							Grades2i=0.5*b2i;
						sbi.append("���ܽϺõ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
				else if((jcbi2.isSelected()==false&&jcbi12.isSelected()==false)||(jcbi2.isSelected()==false&&jcbi12.isSelected())){
						Salary2i=0;
						Grades2i=0;
					}				     				    				     
			     if(jcbi4.isSelected()&&jcbi14.isSelected()){
					Salary3i=a3i;
					Grades3i=b3i;
					sbi.append("���ܽϺõ�����PHP���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbi4.isSelected()){
						
						Salary3i=0.5*a3i;
						Grades3i=0.5*b3i;
						sbi.append("���ܽϺõ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbi4.isSelected()==false&&jcbi14.isSelected()==false)||(jcbi4.isSelected()==false&&jcbi14.isSelected())){
						Salary3i=0;
						Grades3i=0;
					}					     				     				     
			     if(jcbi5.isSelected()&&jcbi15.isSelected()){
						Salary4i=a4i;
						Grades4i=b4i;
						sbi.append("���ܽϺõ�����C#���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbi5.isSelected()){
							
							Salary4i=0.5*a4i;
							Grades4i=0.5*b4i;
							sbi.append("���ܽϺõ�����C#���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}			  
				else if((jcbi5.isSelected()==false&&jcbi15.isSelected()==false)||(jcbi5.isSelected()==false&&jcbi15.isSelected())){
						Salary4i=0;
						Grades4i=0;
					}					     				     				     				     
			     if(jcbi6.isSelected()&&jcbi16.isSelected()){
						Salary5i=a5i;
					    Grades5i=b5i;
					sbi.append("���ܽϺõ�����javascript���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbi6.isSelected()){
							
							Salary5i=0.5*a5i;
							Grades5i=0.5*b5i;
							sbi.append("���ܽϺõ�����javascript,�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							
						}
					else if((jcbi6.isSelected()==false&&jcbi16.isSelected()==false)||(jcbi6.isSelected()==false&&jcbi16.isSelected())){
							Salary5i=0;
							Grades5i=0;
						}					     				     				  			     
			     	if(jcbi3.isSelected()&&jcbi13.isSelected()){
						Salaryi=salaryi(1);
						Gradesi=bi;
						sbi.append("���Ǹ������ios����ʦ!�����г�ǰ����\n");
					}
					else if(jcbi3.isSelected()){
							
							Salaryi=0.5*salaryi(1);
							Gradesi=0.5*bi;
							sbi.append("�㻹��һ����ܳ�Ϊһ�������ios����ʦ��Ҫ������ѧ��ʹ��Xcode�� �����ˣ�\n");
							
						}
					else if((jcbi3.isSelected()==false&&jcbi13.isSelected()==false)||(jcbi3.isSelected()==false&&jcbi13.isSelected())){
							Salaryi=0;
							Gradesi=0;
							sbi.append("���Ǹ����ϸ��ios����ʦ!\n");
						}
					tai.setText("������"+(float)(Salaryi+Salary1i+Salary2i+Salary3i+Salary4i+Salary5i)+"Ԫ\n"+"���֣�"+di.format((Gradesi+Grades1i+Grades2i+Grades3i+Grades4i+Grades5i)*0.9)+"��\n"+sbi);
				}

				if(jcbbi.getSelectedItem()=="����")
				{
					if(jcbi1.isSelected()&&jcbi11.isSelected()){
					Salary1i=a1i;
					Grades1i=b1i;
					sbi.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbi1.isSelected()){
				
					Salary1i=0.5*a1i;
					Grades1i=0.5*b1i;
					sbi.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcbi1.isSelected()==false&&jcbi11.isSelected()==false)||(jcbi1.isSelected()==false&&jcbi11.isSelected())){
					Salary1i=0;
					Grades1i=0;
				}					
			     if(jcbi2.isSelected()&&jcbi12.isSelected()){
					Salary2i=a2i;
					Grades2i=b2i;
					sbi.append("���ܺܺõ�����Java,�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbi2.isSelected()){
						
						Salary2i=0.5*a2i;
						Grades2i=0.5*b2i;
						sbi.append("���ܺܺõ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbi2.isSelected()==false&&jcbi12.isSelected()==false)||(jcbi2.isSelected()==false&&jcbi12.isSelected())){
						Salary2i=0;
						Grades2i=0;
					}				     				    				     
			     if(jcbi4.isSelected()&&jcbi14.isSelected()){
					Salary3i=a3i;
					Grades3i=b3i;
					sbi.append("���ܺܺõ�����PHP���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbi4.isSelected()){
						
						Salary3i=0.5*a3i;
						Grades3i=0.5*b3i;
						sbi.append("���ܺܺõ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbi4.isSelected()==false&&jcbi14.isSelected()==false)||(jcbi4.isSelected()==false&&jcbi14.isSelected())){
						Salary3i=0;
						Grades3i=0;
					}					     				     				     
			     if(jcbi5.isSelected()&&jcbi15.isSelected()){
					Salary4i=a4i;
					Grades4i=b4i;
					sbi.append("���ܺܺõ�����C#���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbi5.isSelected()){
						
						Salary4i=0.5*a4i;
						Grades4i=0.5*b4i;
						sbi.append("���ܺܺõ�����C#���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbi5.isSelected()==false&&jcbi15.isSelected()==false)||(jcbi5.isSelected()==false&&jcbi15.isSelected())){
						Salary4i=0;
						Grades4i=0;
					}					     				     				     				     
			     if(jcbi6.isSelected()&&jcbi16.isSelected()){
					Salary5i=a5i;
					Grades5i=b5i;
					sbi.append("���ܺܺõ�����javascript,�Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbi6.isSelected()){
							
							Salary5i=0.5*a5i;
							Grades5i=0.5*b5i;
							sbi.append("���ܺܺõ�����javascript,�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbi6.isSelected()==false&&jcbi16.isSelected()==false)||(jcbi6.isSelected()==false&&jcbi16.isSelected())){
							Salary5i=0;
							Grades5i=0;
						}					     				     				  			     
			     	if(jcbi3.isSelected()&&jcbi13.isSelected()){
						Salaryi=salaryi(4);
						Gradesi=bi;
						sbi.append("����һ�������ios����ʦ���ǳ����г�ǰ����\n");
					}
					else if(jcbi3.isSelected()){
							
							Salaryi=0.5*salaryi(4);
							Gradesi=0.5*bi;
							sbi.append("�㻹��һ����ܳ�Ϊһ�������ios����ʦ��Ҫ������ѧ��ʹ��Xcode�� �����ˣ�\n");
						}
					else if((jcbi3.isSelected()==false&&jcbi13.isSelected()==false)||(jcbi3.isSelected()==false&&jcbi13.isSelected())){
							Salaryi=0;
							Gradesi=0;
							sbi.append("���Ǹ����ϸ��ios����ʦ!\n");
						}
					tai.setText("������"+(float)(Salaryi+Salary1i+Salary2i+Salary3i+Salary4i+Salary5i)+"Ԫ\n"+"���֣�"+di.format((Gradesi+Grades1i+Grades2i+Grades3i+Grades4i+Grades5i)*0.95)+"��\n"+sbi);
				}
				
				
				if(jcbbi.getSelectedItem()=="����")
				{
					if(jcbi1.isSelected()&&jcbi11.isSelected()){
					Salary1i=a1i;
					Grades1i=b1i;
					sbi.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbi1.isSelected()){
				
					Salary1i=0.5*a1i;
					Grades1i=0.5*b1i;
					sbi.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcbi1.isSelected()==false&&jcbi11.isSelected()==false)||(jcbi1.isSelected()==false&&jcbi11.isSelected())){
					Salary1i=0;
					Grades1i=0;
				}					
			     if(jcbi2.isSelected()&&jcbi12.isSelected()){
					Salary2i=a2i;
					Grades2i=b2i;
					sbi.append("���ܷǳ��õ�����Java���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbi2.isSelected()){
						
						Salary2i=0.5*a2i;
						Grades2i=0.5*b2i;
						sbi.append("���ܷǳ��õ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbi2.isSelected()==false&&jcbi12.isSelected()==false)||(jcbi2.isSelected()==false&&jcbi12.isSelected())){
						Salary2i=0;
						Grades2i=0;
					}				     				    				     
			     if(jcbi4.isSelected()&&jcbi14.isSelected()){
					Salary3i=a3i;
					Grades3i=b3i;
					sbi.append("���ܷǳ��õ�����PHP���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbi4.isSelected()){
						
						Salary3i=0.5*a3i;
						Grades3i=0.5*b3i;
						sbi.append("���ܷǳ��õ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbi4.isSelected()==false&&jcbi14.isSelected()==false)||(jcbi4.isSelected()==false&&jcbi14.isSelected())){
						Salary3i=0;
						Grades3i=0;
					}					     				     				     
			     if(jcbi5.isSelected()&&jcbi15.isSelected()){
					Salary4i=a4i;
					Grades4i=b4i;
					sbi.append("���ܷǳ��õ�����C#���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbi5.isSelected()){
						
						Salary4i=0.5*a4i;
						Grades4i=0.5*b4i;
						sbi.append("���ܷǳ��õ�����C#���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbi5.isSelected()==false&&jcbi15.isSelected()==false)||(jcbi5.isSelected()==false&&jcbi15.isSelected())){
						Salary4i=0;
						Grades4i=0;
					}					     				     				     				     
			     if(jcbi6.isSelected()&&jcbi16.isSelected()){
						Salary5i=a5i;
					    Grades5i=b5i;
						sbi.append("���ܷǳ��õ�����javascript���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbi6.isSelected()){
							
							Salary5i=0.5*a5i;
							Grades5i=0.5*b5i;
							sbi.append("���ܷǳ��õ�����javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbi6.isSelected()==false&&jcbi16.isSelected()==false)||(jcbi6.isSelected()==false&&jcbi16.isSelected())){
							Salary5i=0;
							Grades5i=0;
						}					     				     				  			     
			     	if(jcbi3.isSelected()&&jcbi13.isSelected()){
						Salaryi=salaryi(6);
						Gradesi=bi;
						sbi.append("����һ���ǳ������ios����ʦ!�ǳ����г�ǰ����\n");
					}
					else if(jcbi3.isSelected()){
							
							Salaryi=0.5*salaryi(6);
							Gradesi=0.5*bi;
							sbi.append("�㻹��һ����ܳ�Ϊһ���ǳ������ios����ʦ��Ҫ������ѧ��ʹ��Xcode�� �����ˣ�\n");
						}
					else if((jcbi3.isSelected()==false&&jcbi13.isSelected()==false)||(jcbi3.isSelected()==false&&jcbi13.isSelected())){
							Salaryi=0;
							Gradesi=0;
							sbi.append("���Ǹ����ϸ��ios����ʦ!\n");
						}
					tai.setText("������"+(float)(Salaryi+Salary1i+Salary2i+Salary3i+Salary4i+Salary5i)+"Ԫ\n"+"���֣�"+di.format((Gradesi+Grades1i+Grades2i+Grades3i+Grades4i+Grades5i))+"��\n"+sbi);
				}
				}
			});
			//������ð�ť
			jbi12.setBounds(50, 260, 100, 40);
			jp3.add(jbi12); 
			jbi12.addActionListener(new ActionListener(){  //����C#���ð�ť��Ӧ�¼�
				public void actionPerformed(ActionEvent arg0) {
					tai.setText("");
					jcbi1.setSelected(false);
					jcbi2.setSelected(false);
					jcbi3.setSelected(false);
					jcbi4.setSelected(false);
					jcbi5.setSelected(false);
					jcbi6.setSelected(false);
					jcbi11.setSelected(false);
					jcbi12.setSelected(false);
					jcbi13.setSelected(false);
					jcbi14.setSelected(false);
					jcbi15.setSelected(false);
					jcbi16.setSelected(false);
					Salary1i=0;
					Salary2i=0;
					Salary3i=0;
					Salary4i=0;
					Salary5i=0;
					Grades1i=0;
					Grades2i=0;
					Grades3i=0;
					Grades4i=0;
					Grades5i=0;
					sbi.delete(0, 10000);
				}
				
			});
			jli1.setBounds(20, 20, 60, 40);
			jp3.add(jli1);
			jcbi1.setBounds(80, 20, 80, 40);
			jp3.add(jcbi1);
			jcbi2.setBounds(80+80, 20, 80, 40);
			jp3.add(jcbi2);
			jcbi3.setBounds(80+2*80, 20, 80, 40);
			jp3.add(jcbi3);
			jcbi4.setBounds(80+3*80, 20, 80, 40);
			jp3.add(jcbi4);
			jcbi5.setBounds(80+4*87, 20, 80, 40);
			jp3.add(jcbi5);
			jcbi6.setBounds(80+5*87, 20, 80, 40);
			jp3.add(jcbi6);
			jli2.setBounds(20, 60, 60, 40);
			jp3.add(jli2);
			jcbi11.setBounds(80, 60, 150, 40);
			jp3.add(jcbi11);
			jcbi12.setBounds(320, 60, 80, 40);
			jp3.add(jcbi12);
			jcbi13.setBounds(240, 60, 80, 40);
			jp3.add(jcbi13);
			jcbi14.setBounds(600, 60, 130, 40);
			jp3.add(jcbi14);
			jcbi15.setBounds(428, 60, 80, 40);
			jp3.add(jcbi15);
			jcbi16.setBounds(515, 60, 80, 40);
			jp3.add(jcbi16);
			jli3.setBounds(20, 130, 60, 40);
			jp3.add(jli3);
			jcbbi.setBounds(80, 130, 70, 30);
			jp3.add(jcbbi);
			vi.add("Ӧ��");
			vi.add("һ��");
			vi.add("����");
			vi.add("����");
			tai.setBounds(200, 120, 520, 260);
			jp3.add(tai);
			Font fi =new Font("����",Font.PLAIN,16);	
			tai.setFont(fi);		
			tai.setEditable(false);
			jbi11.setBounds(50, 320, 100, 40);
			jp3.add(jbi11);	
			jbi11.addActionListener(new ActionListener(){//C#����ʦ���ݱ���

				public void actionPerformed(ActionEvent arg0) {
					try{
						File fi=new File("ios����ʦ����.txt");
						fi.createNewFile();
						FileOutputStream f1=new FileOutputStream("ios����ʦ����.txt");
						 byte[] b=new byte[1024];
			             String str=tai.getText().toString();
			             b=str.getBytes();
						f1.write(b);  
						f1.close();
						JOptionPane.showMessageDialog(null, "�������ݳɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
					}
					catch(IOException e){
					JOptionPane.showMessageDialog(null, "�������ݲ��ɹ���", "��ʾ", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			});
/*----------------------------------------------------------------------------------------------------
* ���PHP����ʦ�������
* ---------------------------------------------------------------------------------------------------*/					
			jp4.setLayout(null);  
			jbp1.setBounds(50, 200, 100, 40);
			jp4.add(jbp1); 
			final DecimalFormat dp = new DecimalFormat("######0.00");   
			jbp1.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent arg0) {
				if(jcbbp.getSelectedItem()=="Ӧ��")
					{
						if(jcbp1.isSelected()&&jcbp11.isSelected()){
						Salary1p=a1p;
						Grades1p=b1p;
						sbp.append("��������Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
					}
					else if(jcbp1.isSelected()){
					
						Salary1p=0.5*a1p;
						Grades1p=0.5*b1p;
						sbp.append("��������Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
					else if((jcbp1.isSelected()==false&&jcbp11.isSelected()==false)||(jcbp1.isSelected()==false&&jcbp11.isSelected())){
						Salary1p=0;
						Grades1p=0;
				
					}					
				     if(jcbp2.isSelected()&&jcbp12.isSelected()){
						Salary2p=a2p;
						Grades2p=b2p;
						sbp.append("��������Javascript���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbp2.isSelected()){
							
							Salary2p=0.5*a2p;
							Grades2p=0.5*b2p;
						sbp.append("��������Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbp2.isSelected()==false&&jcbp12.isSelected()==false)||(jcbp2.isSelected()==false&&jcbp12.isSelected())){
							Salary2p=0;
							Grades2p=0;
						}				     				    				     
				     if(jcbp4.isSelected()&&jcbp14.isSelected()){
						Salary3p=a3p;
						Grades3p=b3p;
						sbp.append("��������Java���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcbp4.isSelected()){
							
							Salary3p=0.5*a3p;
							Grades3p=0.5*b3p;
							sbp.append("��������Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbp4.isSelected()==false&&jcbp14.isSelected()==false)||(jcbp4.isSelected()==false&&jcbp14.isSelected())){
							Salary3p=0;
							Grades3p=0;
						}					     				     				     
				     if(jcbp5.isSelected()&&jcbp15.isSelected()){
						Salary4p=a4p;
						Grades4p=b4p;
						sbp.append("��������Html5���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcbp5.isSelected()){
							
							Salary4p=0.5*a4p;
							Grades4p=0.5*b4p;
							sbp.append("��������Html5���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbp5.isSelected()==false&&jcbp15.isSelected()==false)||(jcbp5.isSelected()==false&&jcbp15.isSelected())){
							Salary4p=0;
							Grades4p=0;
						}					     				     				     				     
				     if(jcbp6.isSelected()&&jcbp16.isSelected()){
						Salary5p=a5p;
						Grades5p=b5p;
						sbp.append("��������Jsp���Ǹ�����ļ��ܣ�\n");
						}
						else if(jcbp6.isSelected()){
								
								Salary5p=0.5*a5p;
								Grades5p=0.5*b5p;
								sbp.append("��������Jsp���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							}
						else if((jcbp6.isSelected()==false&&jcbp16.isSelected()==false)||(jcbp6.isSelected()==false&&jcbp16.isSelected())){
								Salary5p=0;
								Grades5p=0;
							}					     				     				  			     
				     	if(jcbp3.isSelected()&&jcbp13.isSelected()){
							Salaryp=salaryp(0);
							Gradesp=bp;
							sbp.append("����һ���ϸ��PHP����ʦ����һ�����г�ǰ����\n");
						}
						else if(jcbp3.isSelected()){
								
								Salaryp=0.5*salaryp(0);
								Gradesp=0.5*bp;
							sbp.append("�㻹��һ����ܳ�Ϊһ���ϸ��PHP����ʦ��Ҫ������ѧ��ʹ��Dreamweaver�� �����ˣ�\n");
							}
						else if((jcbp3.isSelected()==false&&jcbp13.isSelected()==false)||(jcbp3.isSelected()==false&&jcbp13.isSelected())){
								Salaryp=0;
								Gradesp=0;
							sbp.append("���Ǹ����ϸ��PHP����ʦ��\n");
							}

						tap.setText("������"+(float)(Salaryp+Salary1p+Salary2p+Salary3p+Salary4p+Salary5p)+"Ԫ\n"+"���֣�"+dp.format((Gradesp+Grades1p+Grades2p+Grades3p+Grades4p+Grades5p)*0.8)+"��\n"+sbp);
					}

				if(jcbbp.getSelectedItem()=="һ��")
				{
					if(jcbp1.isSelected()&&jcbp11.isSelected()){
					Salary1p=a1p;
					Grades1p=b1p;
					sbp.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
				}
				else if(jcbp1.isSelected()){
				
					Salary1p=0.5*a1p;
					Grades1p=0.5*b1p;
					sbp.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					
				}
				else if((jcbp1.isSelected()==false&&jcbp11.isSelected()==false)||(jcbp1.isSelected()==false&&jcbp11.isSelected())){
					Salary1p=0;
					Grades1p=0;
				}					
			     if(jcbp2.isSelected()&&jcbp12.isSelected()){
					Salary2p=a2p;
					Grades2p=b2p;
					sbp.append("���ܽϺõ�����Javascript���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbp2.isSelected()){
							
							Salary2p=0.5*a2p;
							Grades2p=0.5*b2p;
						sbp.append("���ܽϺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
				else if((jcbp2.isSelected()==false&&jcbp12.isSelected()==false)||(jcbp2.isSelected()==false&&jcbp12.isSelected())){
						Salary2p=0;
						Grades2p=0;
					}				     				    				     
			     if(jcbp4.isSelected()&&jcbp14.isSelected()){
					Salary3p=a3p;
					Grades3p=b3p;
					sbp.append("���ܽϺõ�����Java���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbp4.isSelected()){
						
						Salary3p=0.5*a3p;
						Grades3p=0.5*b3p;
						sbp.append("���ܽϺõ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbp4.isSelected()==false&&jcbp14.isSelected()==false)||(jcbp4.isSelected()==false&&jcbp14.isSelected())){
						Salary3p=0;
						Grades3p=0;
					}					     				     				     
			     if(jcbp5.isSelected()&&jcbp15.isSelected()){
						Salary4p=a4p;
						Grades4p=b4p;
						sbp.append("���ܽϺõ�����Html5���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbp5.isSelected()){
							
							Salary4p=0.5*a4p;
							Grades4p=0.5*b4p;
							sbp.append("���ܽϺõ�����Html5���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}			  
				else if((jcbp5.isSelected()==false&&jcbp15.isSelected()==false)||(jcbp5.isSelected()==false&&jcbp15.isSelected())){
						Salary4p=0;
						Grades4p=0;
					}					     				     				     				     
			     if(jcbp6.isSelected()&&jcbp16.isSelected()){
						Salary5p=a5p;
					    Grades5p=b5p;
					sbp.append("���ܽϺõ�����Jsp���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbp6.isSelected()){
							
							Salary5p=0.5*a5p;
							Grades5p=0.5*b5p;
							sbp.append("���ܽϺõ�����Jsp,�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							
						}
					else if((jcbp6.isSelected()==false&&jcbp16.isSelected()==false)||(jcbp6.isSelected()==false&&jcbp16.isSelected())){
							Salary5p=0;
							Grades5p=0;
						}					     				     				  			     
			     	if(jcbp3.isSelected()&&jcbp13.isSelected()){
						Salaryp=salaryp(1);
						Gradesp=bp;
						sbp.append("���Ǹ������PHP����ʦ!�����г�ǰ����\n");
					}
					else if(jcbp3.isSelected()){
							
							Salaryp=0.5*salaryp(1);
							Gradesp=0.5*bp;
							sbp.append("�㻹��һ����ܳ�Ϊһ�������PHP����ʦ��Ҫ������ѧ��ʹ��Dreamweaver�� �����ˣ�\n");
							
						}
					else if((jcbp3.isSelected()==false&&jcbp13.isSelected()==false)||(jcbp3.isSelected()==false&&jcbp13.isSelected())){
							Salaryp=0;
							Gradesp=0;
							sbp.append("���Ǹ����ϸ��PHP����ʦ!\n");
						}
					tap.setText("������"+(float)(Salaryp+Salary1p+Salary2p+Salary3p+Salary4p+Salary5p)+"Ԫ\n"+"���֣�"+dp.format((Gradesp+Grades1p+Grades2p+Grades3p+Grades4p+Grades5p)*0.9)+"��\n"+sbp);
				}

				if(jcbbp.getSelectedItem()=="����")
				{
					if(jcbp1.isSelected()&&jcbp11.isSelected()){
					Salary1p=a1p;
					Grades1p=b1p;
					sbp.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbp1.isSelected()){
				
					Salary1p=0.5*a1p;
					Grades1p=0.5*b1p;
					sbp.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcbp1.isSelected()==false&&jcbp11.isSelected()==false)||(jcbp1.isSelected()==false&&jcbp11.isSelected())){
					Salary1p=0;
					Grades1p=0;
				}					
			     if(jcbp2.isSelected()&&jcbp12.isSelected()){
					Salary2p=a2p;
					Grades2p=b2p;
					sbp.append("���ܺܺõ�����Javascript,�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbp2.isSelected()){
						
						Salary2p=0.5*a2p;
						Grades2p=0.5*b2p;
						sbp.append("���ܺܺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbp2.isSelected()==false&&jcbp12.isSelected()==false)||(jcbp2.isSelected()==false&&jcbp12.isSelected())){
						Salary2p=0;
						Grades2p=0;
					}				     				    				     
			     if(jcbp4.isSelected()&&jcbp14.isSelected()){
					Salary3p=a3p;
					Grades3p=b3p;
					sbp.append("���ܺܺõ�����Java���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbp4.isSelected()){
						
						Salary3p=0.5*a3p;
						Grades3p=0.5*b3p;
						sbp.append("���ܺܺõ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbp4.isSelected()==false&&jcbp14.isSelected()==false)||(jcbp4.isSelected()==false&&jcbp14.isSelected())){
						Salary3p=0;
						Grades3p=0;
					}					     				     				     
			     if(jcbp5.isSelected()&&jcbp15.isSelected()){
					Salary4p=a4p;
					Grades4p=b4p;
					sbp.append("���ܺܺõ�����Html5���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbp5.isSelected()){
						
						Salary4p=0.5*a4p;
						Grades4p=0.5*b4p;
						sbp.append("���ܺܺõ�����Html5���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbp5.isSelected()==false&&jcbp15.isSelected()==false)||(jcbp5.isSelected()==false&&jcbp15.isSelected())){
						Salary4p=0;
						Grades4p=0;
					}					     				     				     				     
			     if(jcbp6.isSelected()&&jcbp16.isSelected()){
					Salary5p=a5p;
					Grades5p=b5p;
					sbp.append("���ܺܺõ�����Jsp,�Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbp6.isSelected()){
							
							Salary5p=0.5*a5p;
							Grades5p=0.5*b5p;
							sbp.append("���ܺܺõ�����Jsp,�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbp6.isSelected()==false&&jcbp16.isSelected()==false)||(jcbp6.isSelected()==false&&jcbp16.isSelected())){
							Salary5p=0;
							Grades5p=0;
						}					     				     				  			     
			     	if(jcbp3.isSelected()&&jcbp13.isSelected()){
						Salaryp=salaryp(4);
						Gradesp=bp;
						sbp.append("����һ�������PHP����ʦ���ǳ����г�ǰ����\n");
					}
					else if(jcbp3.isSelected()){
							
							Salaryp=0.5*salaryp(4);
							Gradesp=0.5*bp;
							sbp.append("�㻹��һ����ܳ�Ϊһ�������PHP����ʦ��Ҫ������ѧ��ʹ��Dreamweaver�� �����ˣ�\n");
						}
					else if((jcbp3.isSelected()==false&&jcbp13.isSelected()==false)||(jcbp3.isSelected()==false&&jcbp13.isSelected())){
							Salaryp=0;
							Gradesp=0;
							sbp.append("���Ǹ����ϸ��PHP����ʦ!\n");
						}
					tap.setText("������"+(float)(Salaryp+Salary1p+Salary2p+Salary3p+Salary4p+Salary5p)+"Ԫ\n"+"���֣�"+dp.format((Gradesp+Grades1p+Grades2p+Grades3p+Grades4p+Grades5p)*0.95)+"��\n"+sbp);
				}
				
				
				if(jcbbp.getSelectedItem()=="����")
				{
					if(jcbp1.isSelected()&&jcbp11.isSelected()){
					Salary1p=a1p;
					Grades1p=b1p;
					sbp.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbp1.isSelected()){
				
					Salary1p=0.5*a1p;
					Grades1p=0.5*b1p;
					sbp.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcbp1.isSelected()==false&&jcbp11.isSelected()==false)||(jcbp1.isSelected()==false&&jcbp11.isSelected())){
					Salary1p=0;
					Grades1p=0;
				}					
			     if(jcbp2.isSelected()&&jcbp12.isSelected()){
					Salary2p=a2p;
					Grades2p=b2p;
					sbp.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbp2.isSelected()){
						
						Salary2p=0.5*a2p;
						Grades2p=0.5*b2p;
						sbp.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbp2.isSelected()==false&&jcbp12.isSelected()==false)||(jcbp2.isSelected()==false&&jcbp12.isSelected())){
						Salary2p=0;
						Grades2p=0;
					}				     				    				     
			     if(jcbp4.isSelected()&&jcbp14.isSelected()){
					Salary3p=a3p;
					Grades3p=b3p;
					sbp.append("���ܷǳ��õ�����Java���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbp4.isSelected()){
						
						Salary3p=0.5*a3p;
						Grades3p=0.5*b3p;
						sbp.append("���ܷǳ��õ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbp4.isSelected()==false&&jcbp14.isSelected()==false)||(jcbp4.isSelected()==false&&jcbp14.isSelected())){
						Salary3p=0;
						Grades3p=0;
					}					     				     				     
			     if(jcbp5.isSelected()&&jcbp15.isSelected()){
					Salary4p=a4p;
					Grades4p=b4p;
					sbp.append("���ܷǳ��õ�����Html5���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbp5.isSelected()){
						
						Salary4p=0.5*a4p;
						Grades4p=0.5*b4p;
						sbp.append("���ܷǳ��õ�����Html5���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbp5.isSelected()==false&&jcbp15.isSelected()==false)||(jcbp5.isSelected()==false&&jcbp15.isSelected())){
						Salary4p=0;
						Grades4p=0;
					}					     				     				     				     
			     if(jcbp6.isSelected()&&jcbp16.isSelected()){
						Salary5p=a5p;
					    Grades5p=b5p;
						sbp.append("���ܷǳ��õ�����Jsp���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbp6.isSelected()){
							
							Salary5p=0.5*a5p;
							Grades5p=0.5*b5p;
							sbp.append("���ܷǳ��õ�����Jsp���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbp6.isSelected()==false&&jcbp16.isSelected()==false)||(jcbp6.isSelected()==false&&jcbp16.isSelected())){
							Salary5p=0;
							Grades5p=0;
						}					     				     				  			     
			     	if(jcbp3.isSelected()&&jcbp13.isSelected()){
						Salaryp=salaryp(6);
						Gradesp=bp;
						sbp.append("����һ���ǳ������PHP����ʦ!�ǳ����г�ǰ����\n");
					}
					else if(jcbp3.isSelected()){
							
							Salaryp=0.5*salaryp(6);
							Gradesp=0.5*bp;
							sbp.append("�㻹��һ����ܳ�Ϊһ���ǳ������PHP����ʦ��Ҫ������ѧ��ʹ��Dreamweaver�� �����ˣ�\n");
						}
					else if((jcbp3.isSelected()==false&&jcbp13.isSelected()==false)||(jcbp3.isSelected()==false&&jcbp13.isSelected())){
							Salaryp=0;
							Gradesp=0;
							sbp.append("���Ǹ����ϸ��PHP����ʦ!\n");
						}
					tap.setText("������"+(float)(Salaryp+Salary1p+Salary2p+Salary3p+Salary4p+Salary5p)+"Ԫ\n"+"���֣�"+dp.format((Gradesp+Grades1p+Grades2p+Grades3p+Grades4p+Grades5p))+"��\n"+sbp);
				}
				}
			});
			//������ð�ť
			jbp12.setBounds(50, 260, 100, 40);
			jp4.add(jbp12); 
			jbp12.addActionListener(new ActionListener(){  //����C#���ð�ť��Ӧ�¼�
				public void actionPerformed(ActionEvent arg0) {
					tap.setText("");
					jcbp1.setSelected(false);
					jcbp2.setSelected(false);
					jcbp3.setSelected(false);
					jcbp4.setSelected(false);
					jcbp5.setSelected(false);
					jcbp6.setSelected(false);
					jcbp11.setSelected(false);
					jcbp12.setSelected(false);
					jcbp13.setSelected(false);
					jcbp14.setSelected(false);
					jcbp15.setSelected(false);
					jcbp16.setSelected(false);
					Salary1p=0;
					Salary2p=0;
					Salary3p=0;
					Salary4p=0;
					Salary5p=0;
					Grades1p=0;
					Grades2p=0;
					Grades3p=0;
					Grades4p=0;
					Grades5p=0;
					sbp.delete(0, 10000);
				}
				
			});
			jlp1.setBounds(20, 20, 60, 40);
			jp4.add(jlp1);
			jcbp1.setBounds(80, 20, 80, 40);
			jp4.add(jcbp1);
			jcbp2.setBounds(80+80, 20, 80, 40);
			jp4.add(jcbp2);
			jcbp3.setBounds(80+5*87, 20, 80, 40);
			jp4.add(jcbp3);
			jcbp4.setBounds(340, 20, 80, 40);
			jp4.add(jcbp4);
			jcbp5.setBounds(80+4*87, 20, 80, 40);
			jp4.add(jcbp5);
			jcbp6.setBounds(80+2*80, 20, 80, 40);
			jp4.add(jcbp6);
			jlp2.setBounds(20, 60, 60, 40);
			jp4.add(jlp2);
			jcbp11.setBounds(80, 60, 150, 40);
			jp4.add(jcbp11);
			jcbp12.setBounds(240, 60, 100, 40);
			jp4.add(jcbp12);
			jcbp13.setBounds(600, 60, 130, 40);
			jp4.add(jcbp13);
			jcbp14.setBounds(340, 60, 80, 40);
			jp4.add(jcbp14);
			jcbp15.setBounds(428, 60, 80, 40);
			jp4.add(jcbp15);
			jcbp16.setBounds(515, 60, 80, 40);
			jp4.add(jcbp16);
			jlp3.setBounds(20, 130, 60, 40);
			jp4.add(jlp3);
			jcbbp.setBounds(80, 130, 70, 30);
			jp4.add(jcbbp);
			vp.add("Ӧ��");
			vp.add("һ��");
			vp.add("����");
			vp.add("����");
			tap.setBounds(200, 120, 520, 260);
			jp4.add(tap);
			Font fp =new Font("����",Font.PLAIN,16);	
			tap.setFont(fp);				
			tap.setEditable(false);
			jbp11.setBounds(50, 320, 100, 40);
			jp4.add(jbp11);	
			jbp11.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent arg0) {
					try{
						File fp=new File("PHP����ʦ����.txt");
						fp.createNewFile();
						FileOutputStream f1=new FileOutputStream("PHP����ʦ����.txt");
						 byte[] b=new byte[1024];
			             String str=tap.getText().toString();
			             b=str.getBytes();
						f1.write(b);  
						f1.close();
						JOptionPane.showMessageDialog(null, "�������ݳɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
					}
					catch(IOException e){
					JOptionPane.showMessageDialog(null, "�������ݲ��ɹ���", "��ʾ", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			});
/*----------------------------------------------------------------------------------------------------
* ��Ӱ�׿����ʦ�������
* ---------------------------------------------------------------------------------------------------*/						
			jp5.setLayout(null);  
			jba1.setBounds(50, 200, 100, 40);
			jp5.add(jba1); 
			final DecimalFormat    da   = new DecimalFormat("######0.00");   
			jba1.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent arg0) {
				if(jcbba.getSelectedItem()=="Ӧ��")
					{
						if(jcba1.isSelected()&&jcba11.isSelected()){
						Salary1a=a1a;
						Grades1a=b1a;
						sba.append("��������Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
					}
					else if(jcba1.isSelected()){
					
						Salary1a=0.5*a1a;
						Grades1a=0.5*b1a;
						sba.append("��������Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
					else if((jcba1.isSelected()==false&&jcba11.isSelected()==false)||(jcba1.isSelected()==false&&jcba11.isSelected())){
						Salary1a=0;
						Grades1a=0;
				
					}					
				     if(jcba2.isSelected()&&jcba12.isSelected()){
						Salary2a=a2a;
						Grades2a=b2a;
						sba.append("��������Http���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcba2.isSelected()){
							
							Salary2a=0.5*a2a;
							Grades2a=0.5*b2a;
						sba.append("��������Http���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcba2.isSelected()==false&&jcba12.isSelected()==false)||(jcba2.isSelected()==false&&jcba12.isSelected())){
							Salary2a=0;
							Grades2a=0;
						}				     				    				     
				     if(jcba4.isSelected()&&jcba14.isSelected()){
						Salary3a=a3a;
						Grades3a=b3a;
						sba.append("��������Javascript���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcba4.isSelected()){
							
							Salary3a=0.5*a3a;
							Grades3a=0.5*b3a;
							sba.append("��������Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcba4.isSelected()==false&&jcba14.isSelected()==false)||(jcba4.isSelected()==false&&jcba14.isSelected())){
							Salary3a=0;
							Grades3a=0;
						}					     				     				     
				     if(jcba5.isSelected()&&jcba15.isSelected()){
						Salary4a=a4a;
						Grades4a=b4a;
						sba.append("��������PHP���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcba5.isSelected()){
							
							Salary4a=0.5*a4a;
							Grades4a=0.5*b4a;
							sba.append("��������PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcba5.isSelected()==false&&jcba15.isSelected()==false)||(jcba5.isSelected()==false&&jcba15.isSelected())){
							Salary4a=0;
							Grades4a=0;
						}					     				     				     				     
				     if(jcba6.isSelected()&&jcba16.isSelected()){
						Salary5a=a5a;
						Grades5a=b5a;
						sba.append("��������C#���Ǹ�����ļ��ܣ�\n");
						}
						else if(jcba6.isSelected()){
								
								Salary5a=0.5*a5a;
								Grades5a=0.5*b5a;
								sba.append("��������C#���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							}
						else if((jcba6.isSelected()==false&&jcba16.isSelected()==false)||(jcba6.isSelected()==false&&jcba16.isSelected())){
								Salary5a=0;
								Grades5a=0;
							}					     				     				  			     
				     	if(jcba3.isSelected()&&jcba13.isSelected()){
							Salarya=salarya(0);
							Gradesa=ba;
							sba.append("����һ���ϸ�İ�׿����ʦ����һ�����г�ǰ����\n");
						}
						else if(jcba3.isSelected()){
								
								Salarya=0.5*salarya(0);
								Gradesa=0.5*ba;
							sba.append("�㻹��һ����ܳ�Ϊһ���ϸ�İ�׿����ʦ��Ҫ������ѧ��ʹ��Eclipse ADT�� �����ˣ�\n");
							}
						else if((jcba3.isSelected()==false&&jcba13.isSelected()==false)||(jcba3.isSelected()==false&&jcba13.isSelected())){
								Salarya=0;
								Gradesa=0;
							sba.append("���Ǹ����ϸ�İ�׿����ʦ��\n");
							}

						taa.setText("������"+(float)(Salarya+Salary1a+Salary2a+Salary3a+Salary4a+Salary5a)+"Ԫ\n"+"���֣�"+da.format((Gradesa+Grades1a+Grades2a+Grades3a+Grades4a+Grades5a)*0.8)+"��\n"+sba);
					}

				if(jcbba.getSelectedItem()=="һ��")
				{
					if(jcba1.isSelected()&&jcba11.isSelected()){
					Salary1a=a1a;
					Grades1a=b1a;
					sba.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
				}
				else if(jcba1.isSelected()){
				
					Salary1a=0.5*a1a;
					Grades1a=0.5*b1a;
					sba.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					
				}
				else if((jcba1.isSelected()==false&&jcba11.isSelected()==false)||(jcba1.isSelected()==false&&jcba11.isSelected())){
					Salary1a=0;
					Grades1a=0;
				}					
			     if(jcba2.isSelected()&&jcba12.isSelected()){
					Salary2a=a2a;
					Grades2a=b2a;
					sba.append("���ܽϺõ�����Http���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcba2.isSelected()){
							
							Salary2a=0.5*a2a;
							Grades2a=0.5*b2a;
						sba.append("���ܽϺõ�����Http���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
				else if((jcba2.isSelected()==false&&jcba12.isSelected()==false)||(jcba2.isSelected()==false&&jcba12.isSelected())){
						Salary2a=0;
						Grades2a=0;
					}				     				    				     
			     if(jcba4.isSelected()&&jcba14.isSelected()){
					Salary3a=a3a;
					Grades3a=b3a;
					sba.append("���ܽϺõ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcba4.isSelected()){
						
						Salary3a=0.5*a3a;
						Grades3a=0.5*b3a;
						sba.append("���ܽϺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcba4.isSelected()==false&&jcba14.isSelected()==false)||(jcba4.isSelected()==false&&jcba14.isSelected())){
						Salary3a=0;
						Grades3a=0;
					}					     				     				     
			     if(jcba5.isSelected()&&jcba15.isSelected()){
						Salary4a=a4a;
						Grades4a=b4a;
						sba.append("���ܽϺõ�����PHP���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcba5.isSelected()){
							
							Salary4a=0.5*a4a;
							Grades4a=0.5*b4a;
							sba.append("���ܽϺõ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}			  
				else if((jcba5.isSelected()==false&&jcba15.isSelected()==false)||(jcba5.isSelected()==false&&jcba15.isSelected())){
						Salary4a=0;
						Grades4a=0;
					}					     				     				     				     
			     if(jcba6.isSelected()&&jcba16.isSelected()){
						Salary5a=a5a;
					    Grades5a=b5a;
					sba.append("���ܽϺõ����ã�#���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcba6.isSelected()){
							
							Salary5a=0.5*a5a;
							Grades5a=0.5*b5a;
							sba.append("���ܽϺõ����ã�#,�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							
						}
					else if((jcba6.isSelected()==false&&jcba16.isSelected()==false)||(jcba6.isSelected()==false&&jcba16.isSelected())){
							Salary5a=0;
							Grades5a=0;
						}					     				     				  			     
			     	if(jcba3.isSelected()&&jcba13.isSelected()){
						Salarya=salarya(1);
						Gradesa=ba;
						sba.append("���Ǹ�����İ�׿����ʦ!�����г�ǰ����\n");
					}
					else if(jcba3.isSelected()){
							
							Salarya=0.5*salarya(1);
							Gradesa=0.5*ba;
							sba.append("�㻹��һ����ܳ�Ϊһ������İ�׿����ʦ��Ҫ������ѧ��ʹ��Eclipse ADT�� �����ˣ�\n");
							
						}
					else if((jcba3.isSelected()==false&&jcba13.isSelected()==false)||(jcba3.isSelected()==false&&jcba13.isSelected())){
							Salarya=0;
							Gradesa=0;
							sba.append("���Ǹ����ϸ�İ�׿����ʦ!\n");
						}
					taa.setText("������"+(float)(Salarya+Salary1a+Salary2a+Salary3a+Salary4a+Salary5a)+"Ԫ\n"+"���֣�"+da.format((Gradesa+Grades1a+Grades2a+Grades3a+Grades4a+Grades5a)*0.9)+"��\n"+sba);
				}

				if(jcbba.getSelectedItem()=="����")
				{
					if(jcba1.isSelected()&&jcba11.isSelected()){
					Salary1a=a1a;
					Grades1a=b1a;
					sba.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcba1.isSelected()){
				
					Salary1a=0.5*a1a;
					Grades1a=0.5*b1a;
					sba.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcba1.isSelected()==false&&jcba11.isSelected()==false)||(jcba1.isSelected()==false&&jcba11.isSelected())){
					Salary1a=0;
					Grades1a=0;
				}					
			     if(jcba2.isSelected()&&jcba12.isSelected()){
					Salary2a=a2a;
					Grades2a=b2a;
					sba.append("���ܺܺõ�����Http,�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcba2.isSelected()){
						
						Salary2a=0.5*a2a;
						Grades2a=0.5*b2a;
						sba.append("���ܺܺõ�����Http���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcba2.isSelected()==false&&jcba12.isSelected()==false)||(jcba2.isSelected()==false&&jcba12.isSelected())){
						Salary2a=0;
						Grades2a=0;
					}				     				    				     
			     if(jcba4.isSelected()&&jcba14.isSelected()){
					Salary3a=a3a;
					Grades3a=b3a;
					sba.append("���ܺܺõ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcba4.isSelected()){
						
						Salary3a=0.5*a3a;
						Grades3a=0.5*b3a;
						sba.append("���ܺܺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcba4.isSelected()==false&&jcba14.isSelected()==false)||(jcba4.isSelected()==false&&jcba14.isSelected())){
						Salary3a=0;
						Grades3a=0;
					}					     				     				     
			     if(jcba5.isSelected()&&jcba15.isSelected()){
					Salary4a=a4a;
					Grades4a=b4a;
					sba.append("���ܺܺõ�����PHP���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcba5.isSelected()){
						
						Salary4a=0.5*a4a;
						Grades4a=0.5*b4a;
						sba.append("���ܺܺõ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcba5.isSelected()==false&&jcba15.isSelected()==false)||(jcba5.isSelected()==false&&jcba15.isSelected())){
						Salary4a=0;
						Grades4a=0;
					}					     				     				     				     
			     if(jcba6.isSelected()&&jcba16.isSelected()){
					Salary5a=a5a;
					Grades5a=b5a;
					sba.append("���ܺܺõ�����C#,�Ǹ�����ļ��ܣ�\n");
					}
					else if(jcba6.isSelected()){
							
							Salary5a=0.5*a5a;
							Grades5a=0.5*b5a;
							sba.append("���ܺܺõ�����C#,�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcba6.isSelected()==false&&jcba16.isSelected()==false)||(jcba6.isSelected()==false&&jcba16.isSelected())){
							Salary5a=0;
							Grades5a=0;
						}					     				     				  			     
			     	if(jcba3.isSelected()&&jcba13.isSelected()){
						Salarya=salarya(4);
						Gradesa=ba;
						sba.append("����һ������İ�׿����ʦ���ǳ����г�ǰ����\n");
					}
					else if(jcba3.isSelected()){
							
							Salarya=0.5*salarya(4);
							Gradesa=0.5*ba;
							sba.append("�㻹��һ����ܳ�Ϊһ������İ�׿����ʦ��Ҫ������ѧ��ʹ��Eclipse ADT�� �����ˣ�\n");
						}
					else if((jcba3.isSelected()==false&&jcba13.isSelected()==false)||(jcba3.isSelected()==false&&jcba13.isSelected())){
							Salarya=0;
							Gradesa=0;
							sba.append("���Ǹ����ϸ�İ�׿����ʦ!\n");
						}
					taa.setText("������"+(float)(Salarya+Salary1a+Salary2a+Salary3a+Salary4a+Salary5a)+"Ԫ\n"+"���֣�"+da.format((Gradesa+Grades1a+Grades2a+Grades3a+Grades4a+Grades5a)*0.95)+"��\n"+sba);
				}
				
				
				if(jcbba.getSelectedItem()=="����")
				{
					if(jcba1.isSelected()&&jcba11.isSelected()){
					Salary1a=a1a;
					Grades1a=b1a;
					sba.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcba1.isSelected()){
				
					Salary1a=0.5*a1a;
					Grades1a=0.5*b1a;
					sba.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcba1.isSelected()==false&&jcba11.isSelected()==false)||(jcba1.isSelected()==false&&jcba11.isSelected())){
					Salary1a=0;
					Grades1a=0;
				}					
			     if(jcba2.isSelected()&&jcba12.isSelected()){
					Salary2a=a2a;
					Grades2a=b2a;
					sba.append("���ܷǳ��õ�����Http���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcba2.isSelected()){
						
						Salary2a=0.5*a2a;
						Grades2a=0.5*b2a;
						sba.append("���ܷǳ��õ�����Http���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcba2.isSelected()==false&&jcba12.isSelected()==false)||(jcba2.isSelected()==false&&jcba12.isSelected())){
						Salary2a=0;
						Grades2a=0;
					}				     				    				     
			     if(jcba4.isSelected()&&jcba14.isSelected()){
					Salary3a=a3a;
					Grades3a=b3a;
					sba.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcba4.isSelected()){
						
						Salary3a=0.5*a3a;
						Grades3a=0.5*b3a;
						sba.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcba4.isSelected()==false&&jcba14.isSelected()==false)||(jcba4.isSelected()==false&&jcba14.isSelected())){
						Salary3a=0;
						Grades3a=0;
					}					     				     				     
			     if(jcba5.isSelected()&&jcba15.isSelected()){
					Salary4a=a4a;
					Grades4a=b4a;
					sba.append("���ܷǳ��õ�����PHP���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcba5.isSelected()){
						
						Salary4a=0.5*a4a;
						Grades4a=0.5*b4a;
						sba.append("���ܷǳ��õ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcba5.isSelected()==false&&jcba15.isSelected()==false)||(jcba5.isSelected()==false&&jcba15.isSelected())){
						Salary4a=0;
						Grades4a=0;
					}					     				     				     				     
			     if(jcba6.isSelected()&&jcba16.isSelected()){
						Salary5a=a5a;
					    Grades5a=b5a;
						sba.append("���ܷǳ��õ�����C#���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcba6.isSelected()){
							
							Salary5a=0.5*a5a;
							Grades5a=0.5*b5a;
							sba.append("���ܷǳ��õ�����C#���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcba6.isSelected()==false&&jcba16.isSelected()==false)||(jcba6.isSelected()==false&&jcba16.isSelected())){
							Salary5a=0;
							Grades5a=0;
						}					     				     				  			     
			     	if(jcba3.isSelected()&&jcba13.isSelected()){
						Salarya=salarya(6);
						Gradesa=ba;
						sba.append("����һ���ǳ�����İ�׿����ʦ!�ǳ����г�ǰ����\n");
					}
					else if(jcba3.isSelected()){
							
							Salarya=0.5*salarya(6);
							Gradesa=0.5*ba;
							sba.append("�㻹��һ����ܳ�Ϊһ���ǳ�����İ�׿����ʦ��Ҫ������ѧ��ʹ��Eclipse ADT�� �����ˣ�\n");
						}
					else if((jcba3.isSelected()==false&&jcba13.isSelected()==false)||(jcba3.isSelected()==false&&jcba13.isSelected())){
							Salarya=0;
							Gradesa=0;
							sba.append("���Ǹ����ϸ�İ�׿����ʦ!\n");
						}
					taa.setText("������"+(float)(Salarya+Salary1a+Salary2a+Salary3a+Salary4a+Salary5a)+"Ԫ\n"+"���֣�"+da.format((Gradesa+Grades1a+Grades2a+Grades3a+Grades4a+Grades5a))+"��\n"+sba);
				}
				}
			});
			//������ð�ť
			jba12.setBounds(50, 260, 100, 40);
			jp5.add(jba12); 
			jba12.addActionListener(new ActionListener(){  //����C#���ð�ť��Ӧ�¼�
				public void actionPerformed(ActionEvent arg0) {
					taa.setText("");
					jcba1.setSelected(false);
					jcba2.setSelected(false);
					jcba3.setSelected(false);
					jcba4.setSelected(false);
					jcba5.setSelected(false);
					jcba6.setSelected(false);
					jcba11.setSelected(false);
					jcba12.setSelected(false);
					jcba13.setSelected(false);
					jcba14.setSelected(false);
					jcba15.setSelected(false);
					jcba16.setSelected(false);
					Salary1a=0;
					Salary2a=0;
					Salary3a=0;
					Salary4a=0;
					Salary5a=0;
					Grades1a=0;
					Grades2a=0;
					Grades3a=0;
					Grades4a=0;
					Grades5a=0;
					sba.delete(0, 10000);
				}
				
			});
			jla1.setBounds(20, 20, 60, 40);
			jp5.add(jla1);
			jcba1.setBounds(80, 20, 80, 40);
			jp5.add(jcba1);
			jcba2.setBounds(80+80, 20, 80, 40);
			jp5.add(jcba2);
			jcba3.setBounds(80+2*80, 20, 80, 40);
			jp5.add(jcba3);
			jcba4.setBounds(340, 20, 80, 40);
			jp5.add(jcba4);
			jcba5.setBounds(80+4*87, 20, 80, 40);
			jp5.add(jcba5);
			jcba6.setBounds(530, 20, 80, 40);
			jp5.add(jcba6);
			jla2.setBounds(20, 60, 60, 40);
			jp5.add(jla2);
			jcba11.setBounds(80, 60, 150, 40);
			jp5.add(jcba11);
			jcba12.setBounds(610, 60, 130, 40);
			jp5.add(jcba12);
			jcba13.setBounds(240, 60, 100, 40);
			jp5.add(jcba13);
			jcba14.setBounds(340, 60, 100, 40);
			jp5.add(jcba14);
			jcba15.setBounds(428, 60, 100, 40);
			jp5.add(jcba15);
			jcba16.setBounds(530, 60, 80, 40);
			jp5.add(jcba16);
			jla3.setBounds(20, 130, 60, 40);
			jp5.add(jla3);
			jcbba.setBounds(80, 130, 70, 30);
			jp5.add(jcbba);
			va.add("Ӧ��");
			va.add("һ��");
			va.add("����");
			va.add("����");
			taa.setBounds(200, 120, 520, 260);
			jp5.add(taa);
			Font fa =new Font("����",Font.PLAIN,16);	
			taa.setFont(fa);				
			taa.setEditable(false);
			jba11.setBounds(50, 320, 100, 40);
			jp5.add(jba11);	
			jba11.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent arg0) {
					try{
						File fa=new File("��׿����ʦ����.txt");
						fa.createNewFile();
						FileOutputStream f1=new FileOutputStream("��׿����ʦ����.txt");
						 byte[] b=new byte[1024];
			             String str=taa.getText().toString();
			             b=str.getBytes();
						f1.write(b);  
						f1.close();
						JOptionPane.showMessageDialog(null, "�������ݳɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
					}
					catch(IOException e){
					JOptionPane.showMessageDialog(null, "�������ݲ��ɹ���", "��ʾ", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			});
/*----------------------------------------------------------------------------------------------------
* �����Ϸ��������ʦ�������
* ---------------------------------------------------------------------------------------------------*/					
			jp6.setLayout(null);  
			jby1.setBounds(50, 200, 100, 40);
			jp6.add(jby1); 
			final DecimalFormat    dy   = new DecimalFormat("######0.00");   
			jby1.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent arg0) {
				if(jcbby.getSelectedItem()=="Ӧ��")
					{
						if(jcby1.isSelected()&&jcby11.isSelected()){
						Salary1y=a1y;
						Grades1y=b1y;
						sby.append("��������Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
					}
					else if(jcby1.isSelected()){
					
						Salary1y=0.5*a1y;
						Grades1y=0.5*b1y;
						sby.append("��������Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
					else if((jcby1.isSelected()==false&&jcby11.isSelected()==false)||(jcby1.isSelected()==false&&jcby11.isSelected())){
						Salary1y=0;
						Grades1y=0;
				
					}					
				     if(jcby2.isSelected()&&jcby12.isSelected()){
						Salary2y=a2y;
						Grades2y=b2y;
						sby.append("��������Java���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcby2.isSelected()){
							
							Salary2y=0.5*a2y;
							Grades2y=0.5*b2y;
						sby.append("��������java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcby2.isSelected()==false&&jcby12.isSelected()==false)||(jcby2.isSelected()==false&&jcby12.isSelected())){
							Salary2y=0;
							Grades2y=0;
						}				     				    				     
				     if(jcby4.isSelected()&&jcby14.isSelected()){
						Salary3y=a3y;
						Grades3y=b3y;
						sby.append("��������Javascript���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcby4.isSelected()){
							
							Salary3y=0.5*a3y;
							Grades3y=0.5*b3y;
							sby.append("��������Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcby4.isSelected()==false&&jcby14.isSelected()==false)||(jcby4.isSelected()==false&&jcby14.isSelected())){
							Salary3y=0;
							Grades3y=0;
						}					     				     				     
				     if(jcby5.isSelected()&&jcby15.isSelected()){
						Salary4y=a4y;
						Grades4y=b4y;
						sby.append("��������PHP���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcby5.isSelected()){
							
							Salary4y=0.5*a4y;
							Grades4y=0.5*b4y;
							sby.append("��������PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcby5.isSelected()==false&&jcby15.isSelected()==false)||(jcby5.isSelected()==false&&jcby15.isSelected())){
							Salary4y=0;
							Grades4y=0;
						}					     				     				     				     
				     if(jcby6.isSelected()&&jcby16.isSelected()){
						Salary5y=a5y;
						Grades5y=b5y;
						sby.append("��������Linux���Ǹ�����ļ��ܣ�\n");
						}
						else if(jcby6.isSelected()){
								
								Salary5y=0.5*a5y;
								Grades5y=0.5*b5y;
								sby.append("��������Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							}
						else if((jcby6.isSelected()==false&&jcby16.isSelected()==false)||(jcby6.isSelected()==false&&jcby16.isSelected())){
								Salary5y=0;
								Grades5y=0;
							}					     				     				  			     
				     	if(jcby3.isSelected()&&jcby13.isSelected()){
							Salaryy=salaryy(0);
							Gradesy=by;
							sby.append("����һ���ϸ����Ϸ��������ʦ����һ�����г�ǰ����\n");
						}
						else if(jcby3.isSelected()){
								
								Salaryy=0.5*salaryy(0);
								Gradesy=0.5*by;
							sby.append("�㻹��һ����ܳ�Ϊһ���ϸ����Ϸ��������ʦ��Ҫ������ѧ��ʹ�� Unity 3D�� �����ˣ�\n");
							}
						else if((jcby3.isSelected()==false&&jcby13.isSelected()==false)||(jcby3.isSelected()==false&&jcby13.isSelected())){
								Salaryy=0;
								Gradesy=0;
							sby.append("���Ǹ����ϸ����Ϸ��������ʦ��\n");
							}

						tay.setText("������"+(float)(Salaryy+Salary1y+Salary2y+Salary3y+Salary4y+Salary5y)+"Ԫ\n"+"���֣�"+dy.format((Gradesy+Grades1y+Grades2y+Grades3y+Grades4y+Grades5y)*0.8)+"��\n"+sby);
					}

				if(jcbby.getSelectedItem()=="һ��")
				{
					if(jcby1.isSelected()&&jcby11.isSelected()){
					Salary1y=a1y;
					Grades1y=b1y;
					sby.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
					
				}
				else if(jcby1.isSelected()){
				
					Salary1y=0.5*a1y;
					Grades1y=0.5*b1y;
					sby.append("���ܽϺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					
				}
				else if((jcby1.isSelected()==false&&jcby11.isSelected()==false)||(jcby1.isSelected()==false&&jcby11.isSelected())){
					Salary1y=0;
					Grades1y=0;
				}					
			     if(jcby2.isSelected()&&jcby12.isSelected()){
					Salary2y=a2y;
					Grades2y=b2y;
					sby.append("���ܽϺõ�����Java���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcby2.isSelected()){
							
							Salary2y=0.5*a2y;
							Grades2y=0.5*b2y;
						sby.append("���ܽϺõ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
				else if((jcby2.isSelected()==false&&jcby12.isSelected()==false)||(jcby2.isSelected()==false&&jcby12.isSelected())){
						Salary2y=0;
						Grades2y=0;
					}				     				    				     
			     if(jcby4.isSelected()&&jcby14.isSelected()){
					Salary3y=a3y;
					Grades3y=b3y;
					sby.append("���ܽϺõ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcby4.isSelected()){
						
						Salary3y=0.5*a3y;
						Grades3y=0.5*b3y;
						sby.append("���ܽϺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcby4.isSelected()==false&&jcby14.isSelected()==false)||(jcby4.isSelected()==false&&jcby14.isSelected())){
						Salary3y=0;
						Grades3y=0;
					}					     				     				     
			     if(jcby5.isSelected()&&jcby15.isSelected()){
						Salary4y=a4y;
						Grades4y=b4y;
						sby.append("���ܽϺõ�����PHP���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcby5.isSelected()){
							
							Salary4y=0.5*a4y;
							Grades4y=0.5*b4y;
							sby.append("���ܽϺõ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}			  
				else if((jcby5.isSelected()==false&&jcby15.isSelected()==false)||(jcby5.isSelected()==false&&jcby15.isSelected())){
						Salary4y=0;
						Grades4y=0;
					}					     				     				     				     
			     if(jcby6.isSelected()&&jcby16.isSelected()){
						Salary5y=a5y;
					    Grades5y=b5y;
					sby.append("���ܽϺõ�����Linux���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcby6.isSelected()){
							
							Salary5y=0.5*a5y;
							Grades5y=0.5*b5y;
							sby.append("���ܽϺõ�����Linux,�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							
						}
					else if((jcby6.isSelected()==false&&jcby16.isSelected()==false)||(jcby6.isSelected()==false&&jcby16.isSelected())){
							Salary5y=0;
							Grades5y=0;
						}					     				     				  			     
			     	if(jcby3.isSelected()&&jcby13.isSelected()){
						Salaryy=salaryy(1);
						Gradesy=by;
						sby.append("���Ǹ��������Ϸ��������ʦ!�����г�ǰ����\n");
					}
					else if(jcby3.isSelected()){
							
							Salaryy=0.5*salaryy(1);
							Gradesy=0.5*by;
							sby.append("�㻹��һ����ܳ�Ϊһ���������Ϸ��������ʦ��Ҫ������ѧ��ʹ�� Unity 3D�� �����ˣ�\n");
							
						}
					else if((jcby3.isSelected()==false&&jcby13.isSelected()==false)||(jcby3.isSelected()==false&&jcby13.isSelected())){
							Salaryy=0;
							Gradesy=0;
							sby.append("���Ǹ����ϸ����Ϸ��������ʦ!\n");
						}
					tay.setText("������"+(float)(Salaryy+Salary1y+Salary2y+Salary3y+Salary4y+Salary5y)+"Ԫ\n"+"���֣�"+dy.format((Gradesy+Grades1y+Grades2y+Grades3y+Grades4y+Grades5y)*0.9)+"��\n"+sby);
				}

				if(jcbby.getSelectedItem()=="����")
				{
					if(jcby1.isSelected()&&jcby11.isSelected()){
					Salary1y=a1y;
					Grades1y=b1y;
					sby.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcby1.isSelected()){
				
					Salary1y=0.5*a1y;
					Grades1y=0.5*b1y;
					sby.append("���ܺܺõ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcby1.isSelected()==false&&jcby11.isSelected()==false)||(jcby1.isSelected()==false&&jcby11.isSelected())){
					Salary1y=0;
					Grades1y=0;
				}					
			     if(jcby2.isSelected()&&jcby12.isSelected()){
					Salary2y=a2y;
					Grades2y=b2y;
					sby.append("���ܺܺõ�����Java,�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcby2.isSelected()){
						
						Salary2y=0.5*a2y;
						Grades2y=0.5*b2y;
						sby.append("���ܺܺõ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcby2.isSelected()==false&&jcby12.isSelected()==false)||(jcby2.isSelected()==false&&jcby12.isSelected())){
						Salary2y=0;
						Grades2y=0;
					}				     				    				     
			     if(jcby4.isSelected()&&jcby14.isSelected()){
					Salary3y=a3y;
					Grades3y=b3y;
					sby.append("���ܺܺõ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcby4.isSelected()){
						
						Salary3y=0.5*a3y;
						Grades3y=0.5*b3y;
						sby.append("���ܺܺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcby4.isSelected()==false&&jcby14.isSelected()==false)||(jcby4.isSelected()==false&&jcby14.isSelected())){
						Salary3y=0;
						Grades3y=0;
					}					     				     				     
			     if(jcby5.isSelected()&&jcby15.isSelected()){
					Salary4y=a4y;
					Grades4y=b4y;
					sby.append("���ܺܺõ�����PHP���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcby5.isSelected()){
						
						Salary4y=0.5*a4y;
						Grades4y=0.5*b4y;
						sby.append("���ܺܺõ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcby5.isSelected()==false&&jcby15.isSelected()==false)||(jcby5.isSelected()==false&&jcby15.isSelected())){
						Salary4y=0;
						Grades4y=0;
					}					     				     				     				     
			     if(jcby6.isSelected()&&jcby16.isSelected()){
					Salary5y=a5y;
					Grades5y=b5y;
					sby.append("���ܺܺõ�����Linux,�Ǹ�����ļ��ܣ�\n");
					}
					else if(jcby6.isSelected()){
							
							Salary5y=0.5*a5y;
							Grades5y=0.5*b5y;
							sby.append("���ܺܺõ�����Linux,�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcby6.isSelected()==false&&jcby16.isSelected()==false)||(jcby6.isSelected()==false&&jcby16.isSelected())){
							Salary5y=0;
							Grades5y=0;
						}					     				     				  			     
			     	if(jcby3.isSelected()&&jcby13.isSelected()){
						Salaryy=salaryy(4);
						Gradesy=by;
						sby.append("����һ���������Ϸ��������ʦ���ǳ����г�ǰ����\n");
					}
					else if(jcby3.isSelected()){
							
							Salaryy=0.5*salaryy(4);
							Gradesy=0.5*by;
							sby.append("�㻹��һ����ܳ�Ϊһ���������Ϸ��������ʦ��Ҫ������ѧ��ʹ��Unity 3D�� �����ˣ�\n");
						}
					else if((jcby3.isSelected()==false&&jcby13.isSelected()==false)||(jcby3.isSelected()==false&&jcby13.isSelected())){
							Salaryy=0;
							Gradesy=0;
							sby.append("���Ǹ����ϸ����Ϸ��������ʦ!\n");
						}
					tay.setText("������"+(float)(Salaryy+Salary1y+Salary2y+Salary3y+Salary4y+Salary5y)+"Ԫ\n"+"���֣�"+dy.format((Gradesy+Grades1y+Grades2y+Grades3y+Grades4y+Grades5y)*0.95)+"��\n"+sby);
				}
				
				
				if(jcbby.getSelectedItem()=="����")
				{
					if(jcby1.isSelected()&&jcby11.isSelected()){
					Salary1y=a1y;
					Grades1y=b1y;
					sby.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcby1.isSelected()){
				
					Salary1y=0.5*a1y;
					Grades1y=0.5*b1y;
					sby.append("���ܷǳ��õ�����Oracle���ݿ⣬�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcby1.isSelected()==false&&jcby11.isSelected()==false)||(jcby1.isSelected()==false&&jcby11.isSelected())){
					Salary1y=0;
					Grades1y=0;
				}					
			     if(jcby2.isSelected()&&jcby12.isSelected()){
					Salary2y=a2y;
					Grades2y=b2y;
					sby.append("���ܷǳ��õ�����Java���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcby2.isSelected()){
						
						Salary2y=0.5*a2y;
						Grades2y=0.5*b2y;
						sby.append("���ܷǳ��õ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcby2.isSelected()==false&&jcby12.isSelected()==false)||(jcby2.isSelected()==false&&jcby12.isSelected())){
						Salary2y=0;
						Grades2y=0;
					}				     				    				     
			     if(jcby4.isSelected()&&jcby14.isSelected()){
					Salary3y=a3y;
					Grades3y=b3y;
					sby.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcby4.isSelected()){
						
						Salary3y=0.5*a3y;
						Grades3y=0.5*b3y;
						sby.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcby4.isSelected()==false&&jcby14.isSelected()==false)||(jcby4.isSelected()==false&&jcby14.isSelected())){
						Salary3y=0;
						Grades3y=0;
					}					     				     				     
			     if(jcby5.isSelected()&&jcby15.isSelected()){
					Salary4y=a4y;
					Grades4y=b4y;
					sby.append("���ܷǳ��õ�����PHP���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcby5.isSelected()){
						
						Salary4y=0.5*a4y;
						Grades4y=0.5*b4y;
						sby.append("���ܷǳ��õ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcby5.isSelected()==false&&jcby15.isSelected()==false)||(jcby5.isSelected()==false&&jcby15.isSelected())){
						Salary4y=0;
						Grades4y=0;
					}					     				     				     				     
			     if(jcby6.isSelected()&&jcby16.isSelected()){
						Salary5y=a5y;
					    Grades5y=b5y;
						sby.append("���ܷǳ��õ�����Linux���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcby6.isSelected()){
							
							Salary5y=0.5*a5y;
							Grades5y=0.5*b5y;
							sby.append("���ܷǳ��õ�����Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcby6.isSelected()==false&&jcby16.isSelected()==false)||(jcby6.isSelected()==false&&jcby16.isSelected())){
							Salary5y=0;
							Grades5y=0;
						}					     				     				  			     
			     	if(jcby3.isSelected()&&jcby13.isSelected()){
						Salaryy=salaryy(6);
						Gradesy=by;
						sby.append("����һ���ǳ��������Ϸ��������ʦ!�ǳ����г�ǰ����\n");
					}
					else if(jcby3.isSelected()){
							
							Salaryy=0.5*salaryy(6);
							Gradesy=0.5*by;
							sby.append("�㻹��һ����ܳ�Ϊһ���ǳ��������Ϸ��������ʦ��Ҫ������ѧ��ʹ��Unity 3D�� �����ˣ�\n");
						}
					else if((jcby3.isSelected()==false&&jcby13.isSelected()==false)||(jcby3.isSelected()==false&&jcby13.isSelected())){
							Salaryy=0;
							Gradesy=0;
							sby.append("���Ǹ����ϸ����Ϸ��������ʦ!\n");
						}
					tay.setText("������"+(float)(Salaryy+Salary1y+Salary2y+Salary3y+Salary4y+Salary5y)+"Ԫ\n"+"���֣�"+dy.format((Gradesy+Grades1y+Grades2y+Grades3y+Grades4y+Grades5y))+"��\n"+sby);
				}
				}
			});
			//������ð�ť
			jby12.setBounds(50, 260, 100, 40);
			jp6.add(jby12); 
			jby12.addActionListener(new ActionListener(){  //����C#���ð�ť��Ӧ�¼�
				public void actionPerformed(ActionEvent arg0) {
					tay.setText("");
					jcby1.setSelected(false);
					jcby2.setSelected(false);
					jcby3.setSelected(false);
					jcby4.setSelected(false);
					jcby5.setSelected(false);
					jcby6.setSelected(false);
					jcby11.setSelected(false);
					jcby12.setSelected(false);
					jcby13.setSelected(false);
					jcby14.setSelected(false);
					jcby15.setSelected(false);
					jcby16.setSelected(false);
					Salary1y=0;
					Salary2y=0;
					Salary3y=0;
					Salary4y=0;
					Salary5y=0;
					Grades1y=0;
					Grades2y=0;
					Grades3y=0;
					Grades4y=0;
					Grades5y=0;
					sby.delete(0, 10000);
				}
				
			});
			jly1.setBounds(20, 20, 60, 40);
			jp6.add(jly1);
			jcby1.setBounds(80, 20, 80, 40);
			jp6.add(jcby1);
			jcby2.setBounds(80+80, 20, 80, 40);
			jp6.add(jcby2);
			jcby3.setBounds(80+2*80, 20, 80, 40);
			jp6.add(jcby3);
			jcby4.setBounds(80+3*80, 20, 80, 40);
			jp6.add(jcby4);
			jcby5.setBounds(80+4*87, 20, 80, 40);
			jp6.add(jcby5);
			jcby6.setBounds(80+5*87, 20, 80, 40);
			jp6.add(jcby6);
			jly2.setBounds(20, 60, 60, 40);
			jp6.add(jly2);
			jcby11.setBounds(80, 60, 150, 40);
			jp6.add(jcby11);
			jcby12.setBounds(428, 60, 80, 40);
			jp6.add(jcby12);
			jcby13.setBounds(240, 60, 80, 40);
			jp6.add(jcby13);
			jcby14.setBounds(320, 60, 80, 40);
			jp6.add(jcby14);
			jcby15.setBounds(600, 60, 130, 40);
			jp6.add(jcby15);
			jcby16.setBounds(515, 60, 80, 40);
			jp6.add(jcby16);
			jly3.setBounds(20, 130, 60, 40);
			jp6.add(jly3);
			jcbby.setBounds(80, 130, 70, 30);
			jp6.add(jcbby);
			vy.add("Ӧ��");
			vy.add("һ��");
			vy.add("����");
			vy.add("����");
			tay.setBounds(200, 120, 520, 260);
			jp6.add(tay);
			Font fy =new Font("����",Font.PLAIN,16);	
			tay.setFont(fy);				
			tay.setEditable(false);
			jby11.setBounds(50, 320, 100, 40);
			jp6.add(jby11);	
			jby11.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent arg0) {
					try{
						File fa=new File("��Ϸ��������ʦ����.txt");
						fa.createNewFile();
						FileOutputStream f1=new FileOutputStream("��Ϸ��������ʦ����.txt");
						 byte[] b=new byte[1024];
			             String str=tay.getText().toString();
			             b=str.getBytes();
						f1.write(b);  
						f1.close();
						JOptionPane.showMessageDialog(null, "�������ݳɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
					}
					catch(IOException e){
					JOptionPane.showMessageDialog(null, "�������ݲ��ɹ���", "��ʾ", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			});
/*----------------------------------------------------------------------------------------------------
* �����ҳǰ�˹���ʦ�������
* ---------------------------------------------------------------------------------------------------*/					
			jp7.setLayout(null);  
			jbw1.setBounds(50, 200, 100, 40);
			jp7.add(jbw1); 
			final DecimalFormat    dw   = new DecimalFormat("######0.00");   
			jbw1.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent arg0) {
				if(jcbbw.getSelectedItem()=="Ӧ��")
					{
						if(jcbw1.isSelected()&&jcbw11.isSelected()){
						Salary1w=a1w;
						Grades1w=b1w;
						sbw.append("��������Html5���Ǹ�����ļ��ܣ�\n");
					
					}
					else if(jcbw1.isSelected()){
					
						Salary1w=0.5*a1w;
						Grades1w=0.5*b1w;
						sbw.append("��������Html5���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
					else if((jcbw1.isSelected()==false&&jcbw11.isSelected()==false)||(jcbw1.isSelected()==false&&jcbw11.isSelected())){
						Salary1w=0;
						Grades1w=0;
				
					}					
				     if(jcbw2.isSelected()&&jcbw12.isSelected()){
						Salary2w=a2w;
						Grades2w=b2w;
						sbw.append("��������Java���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbw2.isSelected()){
							
							Salary2w=0.5*a2w;
							Grades2w=0.5*b2w;
						sbw.append("��������java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbw2.isSelected()==false&&jcbw12.isSelected()==false)||(jcbw2.isSelected()==false&&jcbw12.isSelected())){
							Salary2w=0;
							Grades2w=0;
						}				     				    				     
				     if(jcbw4.isSelected()&&jcbw14.isSelected()){
						Salary3w=a3w;
						Grades3w=b3w;
						sbw.append("��������Javascript���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcbw4.isSelected()){
							
							Salary3w=0.5*a3w;
							Grades3w=0.5*b3w;
							sbw.append("��������Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbw4.isSelected()==false&&jcbw14.isSelected()==false)||(jcbw4.isSelected()==false&&jcbw14.isSelected())){
							Salary3w=0;
							Grades3w=0;
						}					     				     				     
				     if(jcbw5.isSelected()&&jcbw15.isSelected()){
						Salary4w=a4w;
						Grades4w=b4w;
						sbw.append("��������PHP���Ǹ�����ļ��ܣ�\n");
						
					}
					else if(jcbw5.isSelected()){
							
							Salary4w=0.5*a4w;
							Grades4w=0.5*b4w;
							sbw.append("��������PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbw5.isSelected()==false&&jcbw15.isSelected()==false)||(jcbw5.isSelected()==false&&jcbw15.isSelected())){
							Salary4w=0;
							Grades4w=0;
						}					     				     				     				     
				     if(jcbw6.isSelected()&&jcbw16.isSelected()){
						Salary5w=a5w;
						Grades5w=b5w;
						sbw.append("��������Linux���Ǹ�����ļ��ܣ�\n");
						}
						else if(jcbw6.isSelected()){
								
								Salary5w=0.5*a5w;
								Grades5w=0.5*b5w;
								sbw.append("��������Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							}
						else if((jcbw6.isSelected()==false&&jcbw16.isSelected()==false)||(jcbw6.isSelected()==false&&jcbw16.isSelected())){
								Salary5w=0;
								Grades5w=0;
							}					     				     				  			     
				     	if(jcbw3.isSelected()&&jcbw13.isSelected()){
							Salaryw=salaryw(0);
							Gradesw=bw;
							sbw.append("����һ���ϸ����ҳǰ�˿�������ʦ����һ�����г�ǰ����\n");
						}
						else if(jcbw3.isSelected()){
								
								Salaryw=0.5*salaryw(0);
								Gradesw=0.5*bw;
							sbw.append("�㻹��һ����ܳ�Ϊһ���ϸ����ҳǰ�˿�������ʦ��Ҫ������ѧ��ʹ��Jbuilder�� �����ˣ�\n");
							}
						else if((jcbw3.isSelected()==false&&jcbw13.isSelected()==false)||(jcbw3.isSelected()==false&&jcbw13.isSelected())){
								Salaryw=0;
								Gradesw=0;
							sbw.append("���Ǹ����ϸ����ҳǰ�˿�������ʦ��\n");
							}

						taw.setText("������"+(float)(Salaryw+Salary1w+Salary2w+Salary3w+Salary4w+Salary5w)+"Ԫ\n"+"���֣�"+dw.format((Gradesw+Grades1w+Grades2w+Grades3w+Grades4w+Grades5w)*0.8)+"��\n"+sbw);
					}

				if(jcbbw.getSelectedItem()=="һ��")
				{
					if(jcbw1.isSelected()&&jcbw11.isSelected()){
					Salary1w=a1w;
					Grades1w=b1w;
					sbw.append("���ܽϺõ�����Html5���Ǹ�����ļ��ܣ�\n");
					
				}
				else if(jcbw1.isSelected()){
				
					Salary1w=0.5*a1w;
					Grades1w=0.5*b1w;
					sbw.append("���ܽϺõ�����Html5���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					
				}
				else if((jcbw1.isSelected()==false&&jcbw11.isSelected()==false)||(jcbw1.isSelected()==false&&jcbw11.isSelected())){
					Salary1w=0;
					Grades1w=0;
				}					
			     if(jcbw2.isSelected()&&jcbw12.isSelected()){
					Salary2w=a2w;
					Grades2w=b2w;
					sbw.append("���ܽϺõ�����Java���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbw2.isSelected()){
							
							Salary2w=0.5*a2w;
							Grades2w=0.5*b2w;
						sbw.append("���ܽϺõ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
				else if((jcbw2.isSelected()==false&&jcbw12.isSelected()==false)||(jcbw2.isSelected()==false&&jcbw12.isSelected())){
						Salary2w=0;
						Grades2w=0;
					}				     				    				     
			     if(jcbw4.isSelected()&&jcbw14.isSelected()){
					Salary3w=a3w;
					Grades3w=b3w;
					sbw.append("���ܽϺõ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbw4.isSelected()){
						
						Salary3w=0.5*a3w;
						Grades3w=0.5*b3w;
						sbw.append("���ܽϺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbw4.isSelected()==false&&jcbw14.isSelected()==false)||(jcbw4.isSelected()==false&&jcbw14.isSelected())){
						Salary3w=0;
						Grades3w=0;
					}					     				     				     
			     if(jcbw5.isSelected()&&jcbw15.isSelected()){
						Salary4w=a4w;
						Grades4w=b4w;
						sbw.append("���ܽϺõ�����PHP���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbw5.isSelected()){
							
							Salary4w=0.5*a4w;
							Grades4w=0.5*b4w;
							sbw.append("���ܽϺõ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}			  
				else if((jcbw5.isSelected()==false&&jcbw15.isSelected()==false)||(jcbw5.isSelected()==false&&jcbw15.isSelected())){
						Salary4w=0;
						Grades4w=0;
					}					     				     				     				     
			     if(jcbw6.isSelected()&&jcbw16.isSelected()){
						Salary5w=a5w;
					    Grades5w=b5w;
					sbw.append("���ܽϺõ�����Linux���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbw6.isSelected()){
							
							Salary5w=0.5*a5w;
							Grades5w=0.5*b5w;
							sbw.append("���ܽϺõ�����Linux,�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
							
						}
					else if((jcbw6.isSelected()==false&&jcbw16.isSelected()==false)||(jcbw6.isSelected()==false&&jcbw16.isSelected())){
							Salary5w=0;
							Grades5w=0;
						}					     				     				  			     
			     	if(jcbw3.isSelected()&&jcbw13.isSelected()){
						Salaryw=salaryw(1);
						Gradesw=bw;
						sbw.append("���Ǹ��������ҳǰ�˿�������ʦ!�����г�ǰ����\n");
					}
					else if(jcbw3.isSelected()){
							
							Salaryw=0.5*salaryw(1);
							Gradesw=0.5*bw;
							sbw.append("�㻹��һ����ܳ�Ϊһ���������ҳǰ�˿�������ʦ��Ҫ������ѧ��ʹ�� Jbuilder�� �����ˣ�\n");
							
						}
					else if((jcbw3.isSelected()==false&&jcbw13.isSelected()==false)||(jcbw3.isSelected()==false&&jcbw13.isSelected())){
							Salaryw=0;
							Gradesw=0;
							sbw.append("���Ǹ����ϸ����ҳǰ�˿�������ʦ!\n");
						}
					taw.setText("������"+(float)(Salaryw+Salary1w+Salary2w+Salary3w+Salary4w+Salary5w)+"Ԫ\n"+"���֣�"+dw.format((Gradesw+Grades1w+Grades2w+Grades3w+Grades4w+Grades5w)*0.9)+"��\n"+sbw);
				}

				if(jcbbw.getSelectedItem()=="����")
				{
					if(jcbw1.isSelected()&&jcbw11.isSelected()){
					Salary1w=a1w;
					Grades1w=b1w;
					sbw.append("���ܺܺõ�����Html5���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbw1.isSelected()){
				
					Salary1w=0.5*a1w;
					Grades1w=0.5*b1w;
					sbw.append("���ܺܺõ�����Html5���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcbw1.isSelected()==false&&jcbw11.isSelected()==false)||(jcbw1.isSelected()==false&&jcbw11.isSelected())){
					Salary1w=0;
					Grades1w=0;
				}					
			     if(jcbw2.isSelected()&&jcbw12.isSelected()){
					Salary2w=a2w;
					Grades2w=b2w;
					sbw.append("���ܺܺõ�����Java,�Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbw2.isSelected()){
						
						Salary2w=0.5*a2w;
						Grades2w=0.5*b2w;
						sbw.append("���ܺܺõ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbw2.isSelected()==false&&jcbw12.isSelected()==false)||(jcbw2.isSelected()==false&&jcbw12.isSelected())){
						Salary2w=0;
						Grades2w=0;
					}				     				    				     
			     if(jcbw4.isSelected()&&jcbw14.isSelected()){
					Salary3w=a3w;
					Grades3w=b3w;
					sbw.append("���ܺܺõ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbw4.isSelected()){
						
						Salary3w=0.5*a3w;
						Grades3w=0.5*b3w;
						sbw.append("���ܺܺõ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbw4.isSelected()==false&&jcbw14.isSelected()==false)||(jcbw4.isSelected()==false&&jcbw14.isSelected())){
						Salary3w=0;
						Grades3w=0;
					}					     				     				     
			     if(jcbw5.isSelected()&&jcbw15.isSelected()){
					Salary4w=a4w;
					Grades4w=b4w;
					sbw.append("���ܺܺõ�����PHP���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbw5.isSelected()){
						
						Salary4w=0.5*a4w;
						Grades4w=0.5*b4w;
						sbw.append("���ܺܺõ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbw5.isSelected()==false&&jcbw15.isSelected()==false)||(jcbw5.isSelected()==false&&jcbw15.isSelected())){
						Salary4w=0;
						Grades4w=0;
					}					     				     				     				     
			     if(jcbw6.isSelected()&&jcbw16.isSelected()){
					Salary5w=a5w;
					Grades5w=b5w;
					sbw.append("���ܺܺõ�����Linux,�Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbw6.isSelected()){
							
							Salary5w=0.5*a5w;
							Grades5w=0.5*b5w;
							sbw.append("���ܺܺõ�����Linux,�Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbw6.isSelected()==false&&jcbw16.isSelected()==false)||(jcbw6.isSelected()==false&&jcbw16.isSelected())){
							Salary5w=0;
							Grades5w=0;
						}					     				     				  			     
			     	if(jcbw3.isSelected()&&jcbw13.isSelected()){
						Salaryw=salaryw(4);
						Gradesw=bw;
						sbw.append("����һ���������ҳǰ�˿�������ʦ���ǳ����г�ǰ����\n");
					}
					else if(jcbw3.isSelected()){
							
							Salaryw=0.5*salaryw(4);
							Gradesw=0.5*bw;
							sbw.append("�㻹��һ����ܳ�Ϊһ���������ҳǰ�˿�������ʦ��Ҫ������ѧ��ʹ��Jbuilder�� �����ˣ�\n");
						}
					else if((jcbw3.isSelected()==false&&jcbw13.isSelected()==false)||(jcbw3.isSelected()==false&&jcbw13.isSelected())){
							Salaryw=0;
							Gradesw=0;
							sbw.append("���Ǹ����ϸ����ҳǰ�˿�������ʦ!\n");
						}
					taw.setText("������"+(float)(Salaryw+Salary1w+Salary2w+Salary3w+Salary4w+Salary5w)+"Ԫ\n"+"���֣�"+dw.format((Gradesw+Grades1w+Grades2w+Grades3w+Grades4w+Grades5w)*0.95)+"��\n"+sbw);
				}
				
				
				if(jcbbw.getSelectedItem()=="����")
				{
					if(jcbw1.isSelected()&&jcbw11.isSelected()){
					Salary1w=a1w;
					Grades1w=b1w;
					sbw.append("���ܷǳ��õ�����Html5���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbw1.isSelected()){
				
					Salary1w=0.5*a1w;
					Grades1w=0.5*b1w;
					sbw.append("���ܷǳ��õ�����Html5���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
				}
				else if((jcbw1.isSelected()==false&&jcbw11.isSelected()==false)||(jcbw1.isSelected()==false&&jcbw11.isSelected())){
					Salary1w=0;
					Grades1w=0;
				}					
			     if(jcbw2.isSelected()&&jcbw12.isSelected()){
					Salary2w=a2w;
					Grades2w=b2w;
					sbw.append("���ܷǳ��õ�����Java���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbw2.isSelected()){
						
						Salary2w=0.5*a2w;
						Grades2w=0.5*b2w;
						sbw.append("���ܷǳ��õ�����Java���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbw2.isSelected()==false&&jcbw12.isSelected()==false)||(jcbw2.isSelected()==false&&jcbw12.isSelected())){
						Salary2w=0;
						Grades2w=0;
					}				     				    				     
			     if(jcbw4.isSelected()&&jcbw14.isSelected()){
					Salary3w=a3w;
					Grades3w=b3w;
					sbw.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbw4.isSelected()){
						
						Salary3w=0.5*a3w;
						Grades3w=0.5*b3w;
						sbw.append("���ܷǳ��õ�����Javascript���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbw4.isSelected()==false&&jcbw14.isSelected()==false)||(jcbw4.isSelected()==false&&jcbw14.isSelected())){
						Salary3w=0;
						Grades3w=0;
					}					     				     				     
			     if(jcbw5.isSelected()&&jcbw15.isSelected()){
					Salary4w=a4w;
					Grades4w=b4w;
					sbw.append("���ܷǳ��õ�����PHP���Ǹ�����ļ��ܣ�\n");
				}
				else if(jcbw5.isSelected()){
						
						Salary4w=0.5*a4w;
						Grades4w=0.5*b4w;
						sbw.append("���ܷǳ��õ�����PHP���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
					}
				else if((jcbw5.isSelected()==false&&jcbw15.isSelected()==false)||(jcbw5.isSelected()==false&&jcbw15.isSelected())){
						Salary4w=0;
						Grades4w=0;
					}					     				     				     				     
			     if(jcbw6.isSelected()&&jcbw16.isSelected()){
						Salary5w=a5w;
					    Grades5w=b5w;
						sbw.append("���ܷǳ��õ�����Linux���Ǹ�����ļ��ܣ�\n");
					}
					else if(jcbw6.isSelected()){
							
							Salary5w=0.5*a5w;
							Grades5w=0.5*b5w;
							sbw.append("���ܷǳ��õ�����Linux���Ǹ�����ļ���,������û���������Ŀ������ߣ��е��ź���\n");
						}
					else if((jcbw6.isSelected()==false&&jcbw16.isSelected()==false)||(jcbw6.isSelected()==false&&jcbw16.isSelected())){
							Salary5w=0;
							Grades5w=0;
						}					     				     				  			     
			     	if(jcbw3.isSelected()&&jcbw13.isSelected()){
						Salaryw=salaryw(6);
						Gradesw=bw;
						sbw.append("����һ���ǳ��������ҳǰ�˿�������ʦ!�ǳ����г�ǰ����\n");
					}
					else if(jcbw3.isSelected()){
							
							Salaryw=0.5*salaryw(6);
							Gradesw=0.5*bw;
							sbw.append("�㻹��һ����ܳ�Ϊһ���ǳ��������ҳǰ�˿�������ʦ��Ҫ������ѧ��ʹ��Jbuilder�� �����ˣ�\n");
						}
					else if((jcbw3.isSelected()==false&&jcbw13.isSelected()==false)||(jcbw3.isSelected()==false&&jcbw13.isSelected())){
							Salaryw=0;
							Gradesw=0;
							sbw.append("���Ǹ����ϸ����ҳǰ�˿�������ʦ!\n");
						}
					taw.setText("������"+(float)(Salaryw+Salary1w+Salary2w+Salary3w+Salary4w+Salary5w)+"Ԫ\n"+"���֣�"+dw.format((Gradesw+Grades1w+Grades2w+Grades3w+Grades4w+Grades5w))+"��\n"+sbw);
				}
				}
			});
			//������ð�ť
			jbw12.setBounds(50, 260, 100, 40);
			jp7.add(jbw12); 
			jbw12.addActionListener(new ActionListener(){  //����C#���ð�ť��Ӧ�¼�
				public void actionPerformed(ActionEvent arg0) {
					taw.setText("");
					jcbw1.setSelected(false);
					jcbw2.setSelected(false);
					jcbw3.setSelected(false);
					jcbw4.setSelected(false);
					jcbw5.setSelected(false);
					jcbw6.setSelected(false);
					jcbw11.setSelected(false);
					jcbw12.setSelected(false);
					jcbw13.setSelected(false);
					jcbw14.setSelected(false);
					jcbw15.setSelected(false);
					jcbw16.setSelected(false);
					Salary1w=0;
					Salary2w=0;
					Salary3w=0;
					Salary4w=0;
					Salary5w=0;
					Grades1w=0;
					Grades2w=0;
					Grades3w=0;
					Grades4w=0;
					Grades5w=0;
					sbw.delete(0, 10000);
				}
				
			});
			jlw1.setBounds(20, 20, 60, 40);
			jp7.add(jlw1);
			jcbw1.setBounds(80, 20, 80, 40);
			jp7.add(jcbw1);
			jcbw2.setBounds(80+80, 20, 80, 40);
			jp7.add(jcbw2);
			jcbw3.setBounds(80+2*80, 20, 80, 40);
			jp7.add(jcbw3);
			jcbw4.setBounds(80+3*80, 20, 80, 40);
			jp7.add(jcbw4);
			jcbw5.setBounds(418, 20, 80, 40);
			jp7.add(jcbw5);
			jcbw6.setBounds(530, 20, 80, 40);
			jp7.add(jcbw6);
			jlw2.setBounds(20, 60, 60, 40);
			jp7.add(jlw2);
			jcbw11.setBounds(80, 60, 150, 40);
			jp7.add(jcbw11);
			jcbw12.setBounds(620, 60, 130, 40);
			jp7.add(jcbw12);
			jcbw13.setBounds(240, 60, 80, 40);
			jp7.add(jcbw13);
			jcbw14.setBounds(320, 60, 80, 40);
			jp7.add(jcbw14);
			jcbw15.setBounds(418, 60, 100, 40);
			jp7.add(jcbw15);
			jcbw16.setBounds(530, 60, 80, 40);
			jp7.add(jcbw16);
			jlw3.setBounds(20, 130, 60, 40);
			jp7.add(jlw3);
			jcbbw.setBounds(80, 130, 70, 30);
			jp7.add(jcbbw);
			vw.add("Ӧ��");
			vw.add("һ��");
			vw.add("����");
			vw.add("����");
			taw.setBounds(200, 120, 520, 260);
			jp7.add(taw);
			Font fw =new Font("����",Font.PLAIN,16);	
			taw.setFont(fw);				
			taw.setEditable(false);
			jbw11.setBounds(50, 320, 100, 40);
			jp7.add(jbw11);	
			jbw11.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent arg0) {
					try{
						File fa=new File("��ҳǰ�˿�������ʦ����.txt");
						fa.createNewFile();
						FileOutputStream f1=new FileOutputStream("��ҳǰ�˿�������ʦ����.txt");
						 byte[] b=new byte[1024];
			             String str=taw.getText().toString();
			             b=str.getBytes();
						f1.write(b);  
						f1.close();
						JOptionPane.showMessageDialog(null, "�������ݳɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
					}
					catch(IOException e){
					JOptionPane.showMessageDialog(null, "�������ݲ��ɹ���", "��ʾ", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			});	

			this.setBounds(320,80,780,500);
			this.setTitle("���������");
			this.setVisible(true);
			this.setResizable(false);//���ô�С���ɸı�
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		}
		public static void main(String[] args) {
	        try {
	            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//���÷��Ϊwindows���
	        } catch (Throwable e) {
	            e.printStackTrace();
	        }
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                     new ABC();            
	                	} 
	                catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });  //���ý�����
		}
		public void actionPerformed(ActionEvent arg0) {
			// TODO �Զ����ɵķ������
			
		}
		
}
