 

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc_GUI implements ActionListener {

	public JFrame CalcFrame;
	 
	public JPanel ChapterPanel;
	public JPanel TopicPanel;
	public JPanel SubtopicPanel;
	public JPanel ButtonPanel;
	public JPanel DividerPanel;
	public JPanel IOPanel;
	 
	@SuppressWarnings("rawtypes")
	public JComboBox ChapterComboBox;
	@SuppressWarnings("rawtypes")
	public JComboBox TopicComboBox;
	@SuppressWarnings("rawtypes")
	public JComboBox SubTopicComboBox;
	 
	public JTextArea ChapterTextArea;
	public JTextArea TopicTextArea;
	public JTextArea SubTopicTextArea;
	public JTextArea IOTextArea;
	 
	public JScrollPane IOScrollPane;
	
	public JTextField IOTextField;
	 
	public JButton EnterButton;
	public JButton QuitButton;
	public JButton CalcButton;
	public JButton HideButton;
	 
	public BufferedImage CalcImage;
	 
	public URL CalcIconUrl;
	 
	public Border CalcBorder;
 
	public Font IOTextAreaFont;
	public Font IOTextFieldFont;
	public Font ButtonFont;
	public Font ComboBoxFont;
	public Font TextAreaFont;
	
	public String[] Chapters;
	public String[] Topics;
	public String[] SubTopics;
	
	public String ChapterChoice;
	public String TopicChoice;
	public String SubTopicChoice;
	public String VersalChoice;
	 
	public Pattern IntegerPattern;
	public Matcher IntegerMatcher;
	public String IntegerString;
	public boolean IntegerPossible;
	
	public Pattern DoublePattern;
	public Matcher DoubleMatcher;
	public String DoubleString;
	public boolean DoublePossible;
	
	public Pattern RationalPattern;
	public Matcher RationalMatcher;
	public String RationalString;
	public boolean RationalPossible;
	
	public DecimalFormat decimalFormat;
	 
	public String a0;
	public double a ;
	public int LengthA;
	 
	public String b0;
	public double b;
	public int LengthB;
	
	public String c0;
	public double c;
	public int LengthC;
	
	public String d0;
	public double d;
	public int LengthD; 
	
	public String e0;
	public double e;
	public int LengthE;
	
	public Set<Double> A;
	public Set<Double> B;
	public Set<Double> C;
	
	static String ration1;
    static String ration2;

    static String[] ration_1;
    static String[] ration_2;
	
	public String num10;
	public int num1;
	
	public String dem10;
    public int dem1;
    
    public String num20;
    public int num2;
    
    public String dem20;
    public int dem2;
    
    public int gcd;
    public int lcm;
    
    public String Ans_num0;
    public int Ans_num;
    public int ANS_NUM;
    public String NUM;
    
    public String Ans_dem0;
    public int Ans_dem;
    public int ANS_DEM;
    public String DEM;
    
    public int i;
	
	public ActionListener[] Addition;
	public ActionListener[] Subtraction;
	public ActionListener[] Multiplication;
	public ActionListener[] Division;
	
	public ActionListener[] RationalAddition;
	public ActionListener[] RationalSubtraction;
	public ActionListener[] RationalMultiplication;
	public ActionListener[] RationalDivision;
	
	public ActionListener[] Exponentiation;
	
	public ActionListener[] SimpleInterest;
	public ActionListener[] CompoundInterest;
	
	public ActionListener[] Logarithm;
	
	public ActionListener[] Union;
	public ActionListener[] Intersection;
	
	public ActionListener[] EquilateralTriangleAreaBaseHeight;
	public ActionListener[] EquilateralTrianglePerimeter;
	public ActionListener[] EquilateralTriangleAreaSides;
	
	public ActionListener[] IsoscelesTriangleAreaBaseHeight;
	public ActionListener[] IsoscelesTrianglePerimeter;
	public ActionListener[] IsoscelesTriangleAreaSides;
	
	public ActionListener[] ScaleneTriangleAreaBaseHeight;
	public ActionListener[] ScaleneTrianglePerimeter;
	public ActionListener[] ScaleneTriangleAreaSides;
	
	public ActionListener[] FullCircleArea;
	public ActionListener[] FullCircleCircumference;
	
	public ActionListener[] SemiCircleArea;
	public ActionListener[] SemiCircleCircumference;
	public ActionListener[] SemiCirclePerimeter;
	
	public ActionListener[] RectangleArea;
	public ActionListener[] RectanglePerimeter;
	
	public ActionListener[] SquareArea;
	public ActionListener[] SquarePerimeter;
	
	public ActionListener[] RhombusArea;
	public ActionListener[] RhombusPerimeter;
	
	public ActionListener[] ParallelogramArea;
	public ActionListener[] ParallelogramPerimeter;
	
	public ActionListener[] KiteArea;
	public ActionListener[] KitePerimeter;
	
	public ActionListener[] CubeLateralSurfaceArea;
	public ActionListener[] CubeTotalSurfaceArea;
	public ActionListener[] CubeVolume;
	public ActionListener[] CubePerimeter;
	
	public ActionListener[] CuboidLateralSurfaceArea;
	public ActionListener[] CuboidTotalSurfaceArea;
	public ActionListener[] CuboidVolume;
	public ActionListener[] CuboidPerimeter;
	
    public ActionListener[] SphereSurfaceArea;
    public ActionListener[] SphereVolume;
    
    public ActionListener[] ConeLateralSurfaceArea;
    public ActionListener[] ConeTotalSurfaceArea;
    public ActionListener[] ConeVolume;
    public ActionListener[] ConeSlantHeight;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Calc_GUI() {
		
		CalcFrame = new JFrame();     
        
		ChapterPanel = new JPanel();  
		TopicPanel = new JPanel();    
		SubtopicPanel = new JPanel(); 
		ButtonPanel = new JPanel();   
		DividerPanel = new JPanel(); 
		IOPanel = new JPanel();       
		    
		ChapterComboBox = new JComboBox();       
		TopicComboBox = new JComboBox();         
		SubTopicComboBox = new JComboBox(); 
		                                   
		ChapterTextArea = new JTextArea();  
		TopicTextArea = new JTextArea();    
		SubTopicTextArea = new JTextArea(); 
		IOTextArea = new JTextArea();       
		                                   
		IOScrollPane = new JScrollPane();   
		                                   
		IOTextField = new JTextField();     
		                                   
		EnterButton = new JButton();        
		QuitButton = new JButton();         
		CalcButton = new JButton();         
		HideButton = new JButton();         
		
		IOTextAreaFont = new Font("",0,0); 
		IOTextFieldFont = new Font("",0,0);
		ButtonFont = new Font("",0,0);     
		ComboBoxFont = new Font("",0,0);   
		TextAreaFont = new Font("",0,0); 
		
		Chapters = new String[1]; 
		Chapters[0] = "";
		Topics = new String[1];
		Topics[0] = "";
		SubTopics = new String[1];
		SubTopics[0] = "";
		
		ChapterChoice = ""; 
		TopicChoice = "";   
		SubTopicChoice = "";
		VersalChoice = "";  
		
		IntegerString = "";    
		IntegerPossible = false; 
		
		DoubleString = "";    
		DoublePossible = false; 
		
		RationalString = "";    
		RationalPossible = false; 
		
		decimalFormat = new DecimalFormat();
		
		a0 = "";
		a = 0.0d;
		LengthA = 0;
		
		b0 = "";
		b = 0.0d;
		LengthB = 0;
		
		c0 = "";
		c = 0.0d;
		LengthC = 0;
		
		d0 = "";
		d = 0.0d;
		LengthD = 0;
		
		e0 = "";
		e = 0.0d;
		LengthE = 0;
		
		A = new TreeSet<Double>();
	    B = new TreeSet<Double>();
	    C = new TreeSet<Double>();
		
		ration1 = "";
		ration2 = "";
		
		ration_1 = new String[2];
		ration_1[0] = "";
		ration_1[1] = "";
		ration_2 = new String[2];
		ration_2[0] = "";
		ration_2[1] = "";
		
		num10 = "";
		num1 = 0;
		
		dem10 = "";
		dem1 = 0;
		
		num20 = "";
		num2 = 0;
		
		dem20 = "";
		dem2 = 0;
		
		gcd = 0;
		lcm = 0;
		
		Ans_num0 = "";
		Ans_num = 0;
		ANS_NUM = 0;
		NUM = "";
		
		Ans_dem0 = "";
		Ans_dem = 0;
		ANS_DEM = 0;
		DEM = "";
		
		i = 0;
		
		Addition = new ActionListener[2];               
		Subtraction = new ActionListener[2];            
		Multiplication = new ActionListener[2];         
		Division = new ActionListener[2];               
		                        
		RationalAddition = new ActionListener[2];       
		RationalSubtraction = new ActionListener[2];    
		RationalMultiplication = new ActionListener[2]; 
		RationalDivision = new ActionListener[2];       
		                        
		Exponentiation = new ActionListener[2];    
		
		SimpleInterest = new ActionListener[3];
		CompoundInterest = new ActionListener[4];
		
		Logarithm = new ActionListener[2];
		
	    EquilateralTrianglePerimeter= new ActionListener[1];            
	    EquilateralTriangleAreaSides = new ActionListener[1];  
	    EquilateralTriangleAreaBaseHeight = new ActionListener[2];  
	    
	    IsoscelesTrianglePerimeter = new ActionListener[2];
	    IsoscelesTriangleAreaSides = new ActionListener[2]; 
	    IsoscelesTriangleAreaBaseHeight = new ActionListener[2];
	    
	    ScaleneTrianglePerimeter = new ActionListener[3];         
	    ScaleneTriangleAreaSides = new ActionListener[3];
	    ScaleneTriangleAreaBaseHeight = new ActionListener[2];
	    
	    FullCircleArea = new ActionListener[1];
	    FullCircleCircumference = new ActionListener[1];
	    
	    SemiCircleArea = new ActionListener[1];
	    SemiCircleCircumference = new ActionListener[1];
	    SemiCirclePerimeter = new ActionListener[1];
	    
	    RectangleArea = new ActionListener[2];
	    RectanglePerimeter = new ActionListener[2];
	    
	    SquareArea = new ActionListener[1];
	    SquarePerimeter = new ActionListener[1];
	    
	    RhombusArea = new ActionListener[2];
	    RhombusPerimeter = new ActionListener[1];
	    
	    ParallelogramArea = new ActionListener[2];
	    ParallelogramPerimeter = new ActionListener[2];
	    
	   KiteArea = new ActionListener[2];
	   KitePerimeter = new ActionListener[2];
	   
	   CubeLateralSurfaceArea = new ActionListener[1];
	   CubeTotalSurfaceArea = new ActionListener[1];
	   CubeVolume = new ActionListener[1];
	   CubePerimeter = new ActionListener[1];
	   
	   CuboidLateralSurfaceArea = new ActionListener[3];
	   CuboidTotalSurfaceArea = new ActionListener[3];
	   CuboidVolume = new ActionListener[3];
	   CuboidPerimeter = new ActionListener[3];
	   
	   SphereSurfaceArea = new ActionListener[1];
	   SphereVolume = new ActionListener[1];
	   
	   ConeLateralSurfaceArea = new ActionListener[2];
	   ConeTotalSurfaceArea = new ActionListener[2];
	   ConeVolume = new ActionListener[2];
	   ConeSlantHeight = new ActionListener[2];
	   
		try {
			
			CalcIconUrl = new URL("https://imgur.com/ba2Fgu0.png");
			CalcImage = ImageIO.read(CalcIconUrl);
			
		} 
		catch(MalformedURLException e) {} catch(IOException e) {}
		
		CalcBorder = BorderFactory.createLineBorder(Color.BLACK,2);
		
		IOTextAreaFont = new Font("Consolas",Font.BOLD,15);
		IOTextFieldFont = new Font("Consolas",Font.BOLD,18);
		ButtonFont = new Font("",Font.BOLD,10);
		ComboBoxFont = new Font("Monospaced",Font.BOLD,12);
		TextAreaFont = new Font("Consolas",Font.BOLD,13);
		
		Chapters = new String[11];
		Chapters[0] = "1 : Basic Arithmetic";
		Chapters[1] = "2 : Rational Number";
		Chapters[2] = "3 : Exponentiation";
		Chapters[3] = "4 : Banking";
		Chapters[4] = "5 : Logarithm";
		Chapters[5] = "6 : Set";
		Chapters[6] = "7 : Mensuration";
		Chapters[7] = "8 : Trigonometry";
		Chapters[8] = "9 : Distance Formula";
		Chapters[9] = "10 : Statistics";
	    Chapters[10] = "11 : Probability";
	    
	    Topics = new String[1];
	    Topics[0] = "";
	    
	    SubTopics = new String[1];
	    SubTopics[0] = "";
	    
	    ChapterComboBox = new JComboBox(Chapters);
	    ChapterComboBox.setBounds(64,63,171,30);
	    ChapterComboBox.setFont(ComboBoxFont);
	    ChapterComboBox.setEditable(false);
	    ChapterComboBox.addActionListener(this);
	    ChapterComboBox.setBackground(Color.LIGHT_GRAY);
		ChapterComboBox.setForeground(Color.BLACK);
		
		TopicComboBox = new JComboBox(Topics);
	    TopicComboBox.setBounds(53,63,193,30);
	    TopicComboBox.setFont(ComboBoxFont);
	    TopicComboBox.setEditable(false);
	    TopicComboBox.addActionListener(this);
	    TopicComboBox.setBackground(Color.LIGHT_GRAY);
		TopicComboBox.setForeground(Color.BLACK);
		
		SubTopicComboBox = new JComboBox(SubTopics);
	    SubTopicComboBox.setBounds(41,63,215,30);
	    SubTopicComboBox.setFont(ComboBoxFont);
	    SubTopicComboBox.setEditable(false);
	    SubTopicComboBox.addActionListener(this);
	    SubTopicComboBox.setBackground(Color.LIGHT_GRAY);
		SubTopicComboBox.setForeground(Color.BLACK);

		ChapterTextArea = new JTextArea();
		ChapterTextArea.setBounds(4,8,275,30);
		ChapterTextArea.setText("Choose the chapter you want to solve :");
		ChapterTextArea.setHighlighter(null);
		ChapterTextArea.setEditable(false);
		ChapterTextArea.setLineWrap(true);
		ChapterTextArea.setWrapStyleWord(true);
		ChapterTextArea.setFont(TextAreaFont);
		ChapterTextArea.setBackground(Color.GRAY);
		ChapterTextArea.setForeground(Color.BLACK);
		
		TopicTextArea = new JTextArea();
		TopicTextArea.setBounds(4,8,275,30);
		TopicTextArea.setText("Choose the topic you want to solve :");
		TopicTextArea.setHighlighter(null);
		TopicTextArea.setEditable(false);
		TopicTextArea.setLineWrap(true);
		TopicTextArea.setWrapStyleWord(true);
		TopicTextArea.setFont(TextAreaFont);
		TopicTextArea.setBackground(Color.GRAY);
		TopicTextArea.setForeground(Color.BLACK);
		
		SubTopicTextArea = new JTextArea();                                   
		SubTopicTextArea.setBounds(4,8,285,30);                          
		SubTopicTextArea.setText("Choose the sub-topic you want to solve :");  
		SubTopicTextArea.setHighlighter(null);
		SubTopicTextArea.setEditable(false);
		SubTopicTextArea.setLineWrap(true);
		SubTopicTextArea.setWrapStyleWord(true);
		SubTopicTextArea.setFont(TextAreaFont);                           
		SubTopicTextArea.setBackground(Color.GRAY);                        
		SubTopicTextArea.setForeground(Color.BLACK);                       
		
		IOTextArea = new JTextArea();
		IOTextArea.setFont(IOTextAreaFont);
		IOTextArea.setHighlighter(null);
		IOTextArea.setEditable(false);
		IOTextArea.setLineWrap(false);
		IOTextArea.setWrapStyleWord(false);
		IOTextArea.setBackground(Color.LIGHT_GRAY);
		IOTextArea.setForeground(Color.BLACK);
		
		IOScrollPane = new JScrollPane(IOTextArea);
		IOScrollPane.setWheelScrollingEnabled(true);
		IOScrollPane.setBounds(2,2,330,450);
		IOScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		IOScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		EnterButton = new JButton("ENTER");
		EnterButton.setFont(ButtonFont);
		EnterButton.setBounds(257,456,75,25);
		EnterButton.addActionListener(this);
		EnterButton.setBackground(Color.LIGHT_GRAY);
		EnterButton.setForeground(Color.BLACK);
		
		QuitButton = new JButton("QUIT");
		QuitButton.setFont(ButtonFont);
		QuitButton.setBounds(228,6,70,25);
		QuitButton.addActionListener(this);
		QuitButton.setBackground(Color.LIGHT_GRAY);
		QuitButton.setForeground(Color.BLACK);
		
		CalcButton = new JButton("CALCULATE");
		CalcButton.setFont(ButtonFont);
		CalcButton.setBounds(100,6,100,25);
		CalcButton.addActionListener(this);
		CalcButton.setBackground(Color.LIGHT_GRAY);
		CalcButton.setForeground(Color.BLACK);
		
		HideButton = new JButton("HIDE");
		HideButton.setFont(ButtonFont);
		HideButton.setBounds(2,6,70,25);
		HideButton.addActionListener(this);
		HideButton.setBackground(Color.LIGHT_GRAY);
		HideButton.setForeground(Color.BLACK);
		
		IOTextField  = new JTextField();
		IOTextField.setFont(IOTextFieldFont);
		IOTextField.setCaretColor(Color.WHITE);
		IOTextField.setBounds(2,456,250,25);
		IOTextField.setBackground(Color.BLACK);
		IOTextField.setForeground(Color.WHITE);
		IOTextField.setEditable(true);
		
		ChapterPanel = new JPanel();
		ChapterPanel.setLayout(null);
		ChapterPanel.setBorder(CalcBorder);
		ChapterPanel.setBounds(2,2,300,151);
		ChapterPanel.setBackground(Color.GRAY);
		ChapterPanel.add(ChapterTextArea);
		ChapterPanel.add(ChapterComboBox);
		
		TopicPanel = new JPanel();
		TopicPanel.setLayout(null);
		TopicPanel.setBorder(CalcBorder);
		TopicPanel.setBounds(2,154,300,151);
		TopicPanel.setBackground(Color.GRAY);
		TopicPanel.add(TopicTextArea);
		TopicPanel.add(TopicComboBox);
		
		SubtopicPanel = new JPanel();		
		SubtopicPanel.setLayout(null);
		SubtopicPanel.setBorder(CalcBorder);						
		SubtopicPanel.setBounds(2,306,300,151);									
		SubtopicPanel.setBackground(Color.GRAY);									
		SubtopicPanel.add(SubTopicTextArea);
		SubtopicPanel.add(SubTopicComboBox);
		
		ButtonPanel = new JPanel();
		ButtonPanel.setLayout(null);
		ButtonPanel.setBorder(CalcBorder);
		ButtonPanel.setBounds(2,452,300,33);
		ButtonPanel.setBackground(Color.BLACK);
		ButtonPanel.add(HideButton);
		ButtonPanel.add(CalcButton);
		ButtonPanel.add(QuitButton);
		
		DividerPanel = new JPanel();
		DividerPanel.setBorder(CalcBorder);
		DividerPanel.setBounds(302,2,25,483);
		DividerPanel.setBackground(Color.DARK_GRAY);
		
		IOPanel = new JPanel();
		IOPanel.setLayout(null);
		IOPanel.setBorder(CalcBorder);
		IOPanel.setBounds(327,2,335,483);
		IOPanel.setBackground(Color.BLACK);
		IOPanel.add(IOScrollPane);
		IOPanel.add(IOTextField);
		IOPanel.add(EnterButton);
		
		CalcFrame = new JFrame();
		CalcFrame.setSize(663,487);
		CalcFrame.setIconImage(CalcImage);
		CalcFrame.setUndecorated(true);
		CalcFrame.setTitle("MY-CALCULATOR_(GUI)");
		CalcFrame.getContentPane().setBackground(Color.BLACK);
		CalcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CalcFrame.setLocationRelativeTo(null);
		CalcFrame.setResizable(false);
		CalcFrame.setLayout(null);
		CalcFrame.setVisible(true);
		CalcFrame.getContentPane().add(ChapterPanel);
		CalcFrame.getContentPane().add(TopicPanel);
		CalcFrame.getContentPane().add(SubtopicPanel);
		CalcFrame.getContentPane().add(ButtonPanel);
		CalcFrame.getContentPane().add(DividerPanel);
		CalcFrame.getContentPane().add(IOPanel);
		
	}
	
	@SuppressWarnings({ "unchecked", "static-access" })
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==ChapterComboBox) {
			
			ChapterChoice = String.valueOf(ChapterComboBox.getSelectedItem()).toUpperCase().replaceAll(" ","");
			
			switch(ChapterChoice) {
			
				case "1:BASICARITHMETIC" :
				
				Topics = new String[4];
				Topics[0] = "1 : Addition";
				Topics[1] = "2 : Subtraction";
				Topics[2] = "3 : Multiplication";
				Topics[3] = "4 : Division";
				
				TopicComboBox.removeAllItems();
				
				for(int i = 0;i < 4;i++) {
					
					TopicComboBox.insertItemAt(Topics[i], i);
					TopicComboBox.setSelectedIndex(0);
					
				}
				
				break;
			
				case "2:RATIONALNUMBER" :
				
					Topics = new String[4];
					Topics[0] = "1 : Addition";
					Topics[1] = "2 : Subtraction";
					Topics[2] = "3 : Multiplication";
					Topics[3] = "4 : Division";
					
					TopicComboBox.removeAllItems();
					
					for(int i = 0;i < 4;i++) {
						
						TopicComboBox.insertItemAt(Topics[i], i);
						TopicComboBox.setSelectedIndex(0);
						
					}	
				
				break;
				
				case "3:EXPONENTIATION" :
				
				Topics = new String[1];
		        Topics[0] = "";
				
		        TopicComboBox.removeAllItems();
				
				for(int i = 0;i < 1;i++) {
					
					TopicComboBox.insertItemAt(Topics[i], i);
					TopicComboBox.setSelectedIndex(0);
					
				}
				
				break;
				
				case "4:BANKING" :
				
				Topics = new String[2];
				Topics[0] = "1 : Simple Interest";
				Topics[1] = "2 : Compound Interest";	
				
				TopicComboBox.removeAllItems();
				
				for(int i = 0;i < 2;i++) {
					
					TopicComboBox.insertItemAt(Topics[i], i);
					TopicComboBox.setSelectedIndex(0);
					
				}
					
				break;
				
				case "5:LOGARITHM" :
			
				Topics = new String[1];
		        Topics[0] = "";
				
		        TopicComboBox.removeAllItems();
				
				for(int i = 0;i < 1;i++) {
					
					TopicComboBox.insertItemAt(Topics[i], i);
					TopicComboBox.setSelectedIndex(0);
					
				}
				
				break;	
				
				case "6:SET" :
					
				Topics = new String[2];
			    Topics[0] = "1 : Union";
			    Topics[1] = "2 : Intersection";
					
			    TopicComboBox.removeAllItems();
					
				for(int i = 0;i < 2;i++) {
					
					TopicComboBox.insertItemAt(Topics[i], i);
					TopicComboBox.setSelectedIndex(0);
					
				}	
					
				break;
				
				case "7:MENSURATION" :
				
				Topics = new String[15];

				Topics[0] = "1 : Equilateral Triangle";
				Topics[1] = "2 : Isosceles Triangle";
				Topics[2] = "3 : Scalene Triangle";
				Topics[3] = "4 : Full Circle";
				Topics[4] = "5 : Semi Circle";
				Topics[5] = "6 : Rectangle";
				Topics[6] = "7 : Square";
				Topics[7] = "8 : Rhombus";
				Topics[8] = "9 : Parallelogram";
				Topics[9] = "10 : Kite";
				Topics[10] = "11 : Cube";
				Topics[11] = "12 : Cuboid";
				Topics[12] = "13 : Sphere";
				Topics[13] = "14 : Cone";
				Topics[14] = "15 : Cylinder";
				
				TopicComboBox.removeAllItems();
				
				for(int i = 0;i < 15;i++) {
					
					TopicComboBox.insertItemAt(Topics[i], i);
					TopicComboBox.setSelectedIndex(0);
					
				}	
					
				break;	
				
				case "8:TRIGONOMETRY" :
				
				Topics = new String[12];

				Topics[0] = "1 : Sin";
				Topics[1] = "2 : Cos";
				Topics[2] = "3 : Tan";
				Topics[3] = "4 : Cosec";
				Topics[4] = "5 : Sec";
				Topics[5] = "6 : Cot";
				
				TopicComboBox.removeAllItems();
				
				for(int i = 0;i < 6;i++) {
					
					TopicComboBox.insertItemAt(Topics[i], i);
					TopicComboBox.setSelectedIndex(0);
					
				}	
					
				break;
				
				case "9:DISTANCEFORMULA" :
				
				Topics = new String[1];
		        Topics[0] = "";
				
		        TopicComboBox.removeAllItems();
				
				for(int i = 0;i < 1;i++) {
					
					TopicComboBox.insertItemAt(Topics[i], i);
					TopicComboBox.setSelectedIndex(0);
					
				}	
					
				break;
					
				case "10:STATISTICS" :
				
				Topics = new String[4];
				Topics[0] = "1 : Mean";
				Topics[1] = "2 : Median";
				Topics[2] = "3 : Mode";
				
				TopicComboBox.removeAllItems();
				
				for(int i = 0;i < 3;i++) {
					
					TopicComboBox.insertItemAt(Topics[i], i);
					TopicComboBox.setSelectedIndex(0);
					
				}		
					
				break;
				
				case "11:PROBABILITY" :
				
				Topics = new String[1];
		        Topics[0] = "";
				
		        TopicComboBox.removeAllItems();
				
				for(int i = 0;i < 1;i++) {
					
					TopicComboBox.insertItemAt(Topics[i], i);
					TopicComboBox.setSelectedIndex(0);
					
				}	
				
				break;
				
				default :
					
				Topics = new String[1];
		        Topics[0] = "";
				
		        TopicComboBox.removeAllItems();
				
				for(int i = 0;i < 1;i++) {
					
					TopicComboBox.insertItemAt(Topics[i], i);
					TopicComboBox.setSelectedIndex(0);
					
				}	
				
			}
			
		}
		
		if(ae.getSource()==TopicComboBox) {
			
			TopicChoice = String.valueOf(TopicComboBox.getSelectedItem()).toUpperCase().replaceAll(" ","");
			
			switch(TopicChoice) {
			
			case "1:EQUILATERALTRIANGLE" :
			
			SubTopics = new String[3];
	        SubTopics[0] = "1 : Area with Base & Height";
	        SubTopics[1] = "2 : Area with Sides";
	        SubTopics[2] = "3 : Perimeter";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 3;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
			
			break;	
			
			case "2:ISOSCELESTRIANGLE" :
				
				SubTopics = new String[3];
		        SubTopics[0] = "1 : Area with Base & Height";
		        SubTopics[1] = "2 : Area with Sides";
		        SubTopics[2] = "3 : Perimeter";
				
		        SubTopicComboBox.removeAllItems();
				
				for(int i = 0;i < 3;i++) {
					
					SubTopicComboBox.insertItemAt(SubTopics[i], i);
					SubTopicComboBox.setSelectedIndex(0);
				
					}
				
			break;
			
			case "3:SCALENETRIANGLE" :
				
			SubTopics = new String[3];
	        SubTopics[0] = "1 : Area with Base & Height";
	        SubTopics[1] = "2 : Area with Sides";
	        SubTopics[2] = "3 : Perimeter";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 3;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
				
			break;
			
			case "4:FULLCIRCLE" :
				
			SubTopics = new String[2];
	        SubTopics[0] = "1 : Area";
	        SubTopics[1] = "2 : Circumference";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 2;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
				
			break;
			
			case "5:SEMICIRCLE" :
				
			SubTopics = new String[3];
	        SubTopics[0] = "1 : Area";
	        SubTopics[1] = "2 : Circumference";
	        SubTopics[2] = "3 : Perimeter";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 3;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
				
			break;
			
			case "6:RECTANGLE" :
				
			SubTopics = new String[2];
	        SubTopics[0] = "1 : Area";
	        SubTopics[1] = "2 : Perimeter";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 2;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
				
			break;
			
			case "7:SQUARE" :
				
			SubTopics = new String[2];
	        SubTopics[0] = "1 : Area";
	        SubTopics[1] = "2 : Perimeter";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 2;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
				
			break;
			
			case "8:RHOMBUS" :
				
			SubTopics = new String[2];
	        SubTopics[0] = "1 : Area";
	        SubTopics[1] = "2 : Perimeter";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 2;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
				
			break;
			
			case "9:PARALLELOGRAM" :
				
			SubTopics = new String[2];
	        SubTopics[0] = "1 : Area";
	        SubTopics[1] = "2 : Perimeter";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 2;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
				
			break;
			
			case "10:KITE" :
				
			SubTopics = new String[2];
	        SubTopics[0] = "1 : Area";
	        SubTopics[1] = "2 : Perimeter";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 2;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
				
			break;
			
			case "11:CUBE" :
			
			SubTopics = new String[4];
	        SubTopics[0] = "1 : Lateral Surface Area";
	        SubTopics[1] = "2 : Total Surface Area";
	        SubTopics[2] = "3 : Volume";
	        SubTopics[3] = "4 : Perimeter";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 4;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
				
			break;
			
			case "12:CUBOID" :
				
				SubTopics = new String[4];
		        SubTopics[0] = "1 : Lateral Surface Area";
		        SubTopics[1] = "2 : Total Surface Area";
		        SubTopics[2] = "3 : Volume";
		        SubTopics[3] = "4 : Perimeter";
				
		        SubTopicComboBox.removeAllItems();
				
				for(int i = 0;i < 4;i++) {
					
					SubTopicComboBox.insertItemAt(SubTopics[i], i);
					SubTopicComboBox.setSelectedIndex(0);
				
					}
					
			break;
			
			case "13:SPHERE" :
				
			SubTopics = new String[4];
	        SubTopics[0] = "1 : Surface Area";
	        SubTopics[1] = "2 : Volume";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 2;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
				
			break;
			
			case "14:CONE" :
				
			SubTopics = new String[4];
	        SubTopics[0] = "1 : Lateral Surface Area";
	        SubTopics[1] = "2 : Total Surface Area";
	        SubTopics[2] = "3 : Volume";
	        SubTopics[3] = "4 : Slant Height";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 4;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
				
			break;
			
			case "15:CYLINDER" :
				
				SubTopics = new String[4];
		        SubTopics[0] = "1 : Curved Surface Area";
		        SubTopics[1] = "2 : Total Surface Area";
		        SubTopics[2] = "3 : Volume";
				
		        SubTopicComboBox.removeAllItems();
				
				for(int i = 0;i < 3;i++) {
					
					SubTopicComboBox.insertItemAt(SubTopics[i], i);
					SubTopicComboBox.setSelectedIndex(0);
				
					}
					
				break;
			
			default :
				
			SubTopics = new String[1];
	        SubTopics[0] = "";
			
	        SubTopicComboBox.removeAllItems();
			
			for(int i = 0;i < 1;i++) {
				
				SubTopicComboBox.insertItemAt(SubTopics[i], i);
				SubTopicComboBox.setSelectedIndex(0);
			
				}
			
			}
			
		}
		
		if(ae.getSource()==CalcButton) {
			
			ChapterChoice = String.valueOf(ChapterComboBox.getSelectedItem()).toUpperCase().replaceAll(" ","");
			TopicChoice = String.valueOf(TopicComboBox.getSelectedItem()).toUpperCase().replaceAll(" ","");
			SubTopicChoice = String.valueOf(SubTopicComboBox.getSelectedItem()).toUpperCase().replaceAll(" ","");
			
			VersalChoice = ChapterChoice + TopicChoice + SubTopicChoice;
			
			EnterButton.addActionListener(this);
			
			switch(VersalChoice) {
			
				case "1:BASICARITHMETIC1:ADDITION" :
				
				IOTextArea.setText("Enter 1st Operand");
				
				Addition();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(Addition[0]);
				
				break;
				
				case "1:BASICARITHMETIC2:SUBTRACTION" :
					
				IOTextArea.setText("Enter Larger Operand");
				
				Subtraction();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(Subtraction[0]);
				
				break;
				
				case "1:BASICARITHMETIC3:MULTIPLICATION" :
					
				IOTextArea.setText("Enter 1st Operand");
				
				Multiplication();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(Multiplication[0]);
					
				break;
				
				case "1:BASICARITHMETIC4:DIVISION" :
					
				IOTextArea.setText("Enter Dividend Operand");
				
				Division();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(Division[0]);
						
				break;
				
				case "2:RATIONALNUMBER1:ADDITION" :
					
				IOTextArea.setText("Enter 1st Rational Operand");
				
				RationalAddition();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(RationalAddition[0]);
						
				break;
				
				case "2:RATIONALNUMBER2:SUBTRACTION" :
					
				IOTextArea.setText("Enter Larger Rational Operand");
				
				RationalSubtraction();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(RationalSubtraction[0]);
						
				break;
				
				case "2:RATIONALNUMBER3:MULTIPLICATION" :
					
				IOTextArea.setText("Enter 1st Rational Operand");
				
				RationalMultiplication();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(RationalMultiplication[0]);
						
				break;
				
				case "2:RATIONALNUMBER4:DIVISION" :
					
				IOTextArea.setText("Enter Rational Dividend Operand");
				
				RationalDivision();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(RationalDivision[0]);
						
				break;
				
				case "3:EXPONENTIATION" :
					
				IOTextArea.setText("Enter Base Operand");
				
				Exponentiation();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(Exponentiation[0]);
							
				break;
				
				case "4:BANKING1:SIMPLEINTEREST" :
					
				IOTextArea.setText("Enter Principle Amount");
				
				SimpleInterest();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(SimpleInterest[0]);
							
				break;
				
				case "4:BANKING2:COMPOUNDINTEREST" :
					
				IOTextArea.setText("Enter Principle Amount");
				
				CompoundInterest();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(CompoundInterest[0]);
							
				break;
				
				case "5:LOGARITHM" :
					
				IOTextArea.setText("Enter Log Operand");
				
				Logarithm();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(Logarithm[0]);
							
				break;
				
				case "6:SET1:UNION" :
					
				IOTextArea.setText("Enter no.of Elements in Set [A]");
				
				SetUnion();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(Union[0]);
							
				break;
				
				case "6:SET2:INTERSECTION" :
					
				IOTextArea.setText("Enter no.of Elements in Set [A]");
				
				SetIntersection();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(Intersection[0]);
							
				break;
				
				case "7:MENSURATION1:EQUILATERALTRIANGLE1:AREAWITHBASE&HEIGHT" :
					
				IOTextArea.setText("Enter Base Operand");
				
				EquilateralTriangleAreaBaseHeight();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(EquilateralTriangleAreaBaseHeight[0]);
							
				break;
				
				case "7:MENSURATION1:EQUILATERALTRIANGLE2:AREAWITHSIDES" :
					
				IOTextArea.setText("Enter Side Operand");
				
				EquilateralTriangleAreaSides();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(EquilateralTriangleAreaSides[0]);
							
				break;
				
				case "7:MENSURATION1:EQUILATERALTRIANGLE3:PERIMETER" :
					
				IOTextArea.setText("Enter Side Operand");
				
				EquilateralTrianglePerimeter();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(EquilateralTrianglePerimeter[0]);
							
				break;
				
				case "7:MENSURATION2:ISOSCELESTRIANGLE1:AREAWITHBASE&HEIGHT" :
					
				IOTextArea.setText("Enter Base Operand");
				
				IsoscelesTriangleAreaBaseHeight();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(IsoscelesTriangleAreaBaseHeight[0]);
								
				break;
				
				case "7:MENSURATION2:ISOSCELESTRIANGLE2:AREAWITHSIDES" :
					
				IOTextArea.setText("Enter Equal Side Operand");
				
				IsoscelesTriangleAreaSides();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(IsoscelesTriangleAreaSides[0]);
								
				break;
				
				case "7:MENSURATION2:ISOSCELESTRIANGLE3:PERIMETER" :
					
				IOTextArea.setText("Enter Equal Side Operand");
				
				IsoscelesTrianglePerimeter();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(IsoscelesTrianglePerimeter[0]);
								
				break;
					
				case "7:MENSURATION3:SCALENETRIANGLE1:AREAWITHBASE&HEIGHT" :
					
				IOTextArea.setText("Enter Base Operand");
				
				ScaleneTriangleAreaBaseHeight();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(ScaleneTriangleAreaBaseHeight[0]);
							
				break;
				
				case "7:MENSURATION3:SCALENETRIANGLE2:AREAWITHSIDES" :
					
				IOTextArea.setText("Enter 1st Side Operand");
				
				ScaleneTriangleAreaSides();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(ScaleneTriangleAreaSides[0]);
							
				break;
				
				case "7:MENSURATION3:SCALENETRIANGLE3:PERIMETER" :
					
				IOTextArea.setText("Enter 1st Side Operand");
				
				ScaleneTrianglePerimeter();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(ScaleneTrianglePerimeter[0]);
							
				break;
				
				case "7:MENSURATION4:FULLCIRCLE1:AREA" :
					
				IOTextArea.setText("Enter Radius Operand");
				
				FullCircleArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(FullCircleArea[0]);
							
				break;
				
				case "7:MENSURATION4:FULLCIRCLE2:CIRCUMFERENCE" :
					
				IOTextArea.setText("Enter Radius Operand");
				
				FullCircleCircumference();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(FullCircleCircumference[0]);
							
				break;
				
				case "7:MENSURATION5:SEMICIRCLE1:AREA" :
					
				IOTextArea.setText("Enter Radius Operand");
				
				SemiCircleArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(SemiCircleArea[0]);
							
				break;
				
				case "7:MENSURATION5:SEMICIRCLE2:CIRCUMFERENCE" :
					
				IOTextArea.setText("Enter Radius Operand");
				
				SemiCircleCircumference();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(SemiCircleCircumference[0]);
							
				break;
				
				case "7:MENSURATION5:SEMICIRCLE3:PERIMETER" :
					
				IOTextArea.setText("Enter Radius Operand");
				
				SemiCirclePerimeter();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(SemiCirclePerimeter[0]);
							
				break;
				
				case "7:MENSURATION6:RECTANGLE1:AREA" :
					
				IOTextArea.setText("Enter Length Operand");
				
				RectangleArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(RectangleArea[0]);
							
				break;
				
				case "7:MENSURATION6:RECTANGLE2:PERIMETER" :
					
				IOTextArea.setText("Enter Length Operand");
				
				RectanglePerimeter();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(RectanglePerimeter[0]);
							
				break;
				
				case "7:MENSURATION7:SQUARE1:AREA" :
					
				IOTextArea.setText("Enter Side Operand");
				
				SquareArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(SquareArea[0]);
							
				break;
				
				case "7:MENSURATION7:SQUARE2:PERIMETER" :
					
				IOTextArea.setText("Enter Side Operand");
				
				SquarePerimeter();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(SquarePerimeter[0]);
							
				break;
				
				case "7:MENSURATION8:RHOMBUS1:AREA" :
					
				IOTextArea.setText("Enter 1st Diagonal Operand");
				
				RhombusArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(RhombusArea[0]);
							
				break;
				
				case "7:MENSURATION8:RHOMBUS2:PERIMETER" :
					
				IOTextArea.setText("Enter Side Operand");
				
				RhombusPerimeter();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(RhombusPerimeter[0]);
							
				break;
				
				case "7:MENSURATION9:PARALLELOGRAM1:AREA" :
					
				IOTextArea.setText("Enter Base Operand");
				
				ParallelogramArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(ParallelogramArea[0]);
							
				break;
				
				case "7:MENSURATION9:PARALLELOGRAM2:PERIMETER" :
					
				IOTextArea.setText("Enter Length Operand");
				
				ParallelogramPerimeter();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(ParallelogramPerimeter[0]);
							
				break;
				
				case "7:MENSURATION10:KITE1:AREA" :
					
				IOTextArea.setText("Enter 1st Diagonal Operand");
				
				KiteArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(KiteArea[0]);
							
				break;
				
				case "7:MENSURATION10:KITE2:PERIMETER" :
					
				IOTextArea.setText("Enter Shorter Side Operand");
				
				KitePerimeter();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(KitePerimeter[0]);
							
				break;
				
				case "7:MENSURATION11:CUBE1:LATERALSURFACEAREA" :
					
				IOTextArea.setText("Enter Side Operand");
				
				CubeLateralSurfaceArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(CubeLateralSurfaceArea[0]);
							
				break;
				
				case "7:MENSURATION11:CUBE2:TOTALSURFACEAREA" :
					
				IOTextArea.setText("Enter Side Operand");
				
				CubeTotalSurfaceArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(CubeTotalSurfaceArea[0]);
							
				break;
				
				case "7:MENSURATION11:CUBE3:VOLUME" :
					
				IOTextArea.setText("Enter Side Operand");
				
				CubeVolume();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(CubeVolume[0]);
							
				break;
				
				case "7:MENSURATION11:CUBE4:PERIMETER" :
					
				IOTextArea.setText("Enter Side Operand");
				
				CubePerimeter();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(CubePerimeter[0]);
							
				break;
				
				case "7:MENSURATION12:CUBOID1:LATERALSURFACEAREA" :
					
				IOTextArea.setText("Enter Length Operand");
				
				CuboidLateralSurfaceArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(CuboidLateralSurfaceArea[0]);
							
				break;
				
				case "7:MENSURATION12:CUBOID2:TOTALSURFACEAREA" :
					
				IOTextArea.setText("Enter Length Operand");
				
				CuboidTotalSurfaceArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(CuboidTotalSurfaceArea[0]);
							
				break;
				
				case "7:MENSURATION12:CUBOID3:VOLUME" :
					
				IOTextArea.setText("Enter Length Operand");
				
				CuboidVolume();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(CuboidVolume[0]);
							
				break;
				
				case "7:MENSURATION12:CUBOID4:PERIMETER" :
					
				IOTextArea.setText("Enter Length Operand");
				
				CuboidPerimeter();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(CuboidPerimeter[0]);
							
				break;
				
				case "7:MENSURATION13:SPHERE1:SURFACEAREA" :
					
				IOTextArea.setText("Enter Radius Operand");
				
				SphereSurfaceArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(SphereSurfaceArea[0]);
							
				break;
				
				case "7:MENSURATION13:SPHERE2:VOLUME" :
					
				IOTextArea.setText("Enter Radius Operand");
				
				SphereVolume();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(SphereVolume[0]);
							
				break;
				
				case "7:MENSURATION14:CONE1:LATERALSURFACEAREA" :
					
				IOTextArea.setText("Enter RadiusOperand");
				
				ConeLateralSurfaceArea();
				
				EnterButton.removeActionListener(this);
				EnterButton.addActionListener(ConeLateralSurfaceArea[0]);
				
				default :
					
				error();
			
			}
			
		}
			
		if(ae.getSource()==HideButton) {
			
			CalcFrame.setState(CalcFrame.ICONIFIED);
			
		}
		
		if(ae.getSource()==QuitButton) {
			
			System.exit(0);
			
		}
		
	}
	
	public void Addition() {
		
		Addition = new ActionListener[2];
		
		Addition[0] = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter 2nd Operand");
					
					EnterButton.removeActionListener(Addition[0]);
					EnterButton.addActionListener(Addition[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Addition[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						
						c = a + b;
						
						c0 = String.valueOf(c);
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a + b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a + b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = (LengthA > LengthB ? LengthA : LengthB);
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a + b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0 + " + " + b0 + " = " + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(Addition[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void Subtraction() {
		
		Subtraction = new ActionListener[2];
		
		Subtraction[0] = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Smaller Operand");
					
					EnterButton.removeActionListener(Subtraction[0]);
					EnterButton.addActionListener(Subtraction[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Subtraction[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						
						c = a - b;
						
						c0 = String.valueOf(c);
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a - b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a - b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = (LengthA > LengthB ? LengthA : LengthB);
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a - b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0 + " - " + b0 + " = " + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(Subtraction[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void Multiplication() {
		
		Multiplication = new ActionListener[2];
		
		Multiplication[0] = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter 2nd Operand");
					
					EnterButton.removeActionListener(Multiplication[0]);
					EnterButton.addActionListener(Multiplication[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Multiplication[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						
						c = a * b;
						
						c0 = String.valueOf(c);
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a * b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a * b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthA + LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a * b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0 + " × " + b0 + " = " + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(Multiplication[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void Division() {
		
		Division = new ActionListener[2];
		
		Division[0] = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Divisor Operand");
					
					EnterButton.removeActionListener(Division[0]);
					EnterButton.addActionListener(Division[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Division[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						
						c = a / b;
						
						c0 = String.valueOf(c);
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a / b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a / b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthA + LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a / b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0 + " ÷ " + b0 + " = " + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(Division[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}

	public void RationalAddition() {
		
		RationalAddition = new ActionListener[2];
		
		RationalAddition[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				ration1 = IOTextField.getText();
				ration1.replaceAll(" ", "");
				
				if(isRational(ration1)) {
					
					ration_1 = ration1.split("/");
	                num1 = Integer.valueOf(ration_1[0]);
	                dem1 = Integer.valueOf(ration_1[1]);
	                
	                IOTextField.setText("");
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration1);
	                
	                IOTextArea.setText(IOTextArea.getText() + "\nEnter 2nd Rational Operand");
					
	                EnterButton.removeActionListener(RationalAddition[0]);
	                EnterButton.addActionListener(RationalAddition[1]);
	                
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		RationalAddition[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				ration2 = IOTextField.getText();
				ration2.replaceAll(" ", "");
				
				if(isRational(ration2)) {
					
					ration_2 = ration2.split("/");
	                num2 = Integer.valueOf(ration_2[0]);
	                dem2 = Integer.valueOf(ration_2[1]);
	                
	                IOTextField.setText("");
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration2);

	                lcm = (dem1 > dem2) ? dem1 : dem2;
	                while(true) {
	                	
	                    if( lcm % dem1 == 0 && lcm % dem2 == 0 ) {
	                    	
	                        break;
	                        
	                    }
	                    
	                    ++lcm;
	                }

	                Ans_dem = lcm;
	                Ans_num = (lcm / dem1) * num1 + (lcm / dem2) * num2;

	                gcd = 1;
	                
	                if(Math.abs(Ans_num) == Math.abs(Ans_dem)) {
	                	
	                	gcd = Ans_num;
	                	
	                }
	                
	                if(Ans_num >= 0) {
	                
		                for(int i = 1; i <= Ans_num && i <= Ans_dem; ++i) {
		                
		                    if(Ans_num % i == 0 && Ans_dem % i == 0) {
		                    
		                        gcd = i;
		                        
		                    }
		                    
		                }
		                
	                }
	                else
	                {
	                	
	                	for(int i = 1; i >= Ans_num && i <= Ans_dem; --i) 
		                {
		                    if(Ans_num % i == 0 && Ans_dem % i == 0) {
		                    	
		                        gcd = i * -1;
		                        
		                    }
		                    
		                }
	                	
	                }
	                
	                ANS_NUM = Ans_num / gcd;
	                ANS_DEM = Ans_dem / gcd;
	                
	                NUM = String.valueOf(ANS_NUM);
	                DEM = String.valueOf(ANS_DEM);
	                
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration1 + " + " + ration2 + " = ");
	                IOTextArea.setText(IOTextArea.getText() + NUM + "/" + DEM);
	                
	                EnterButton.removeActionListener(RationalAddition[1]);
	                
	                num1 = 0;
	                dem1 = 0;
	                
	                num2 = 0;
	                dem2 = 0;
	                
	                Ans_num = 0;
	                Ans_dem = 0;
	                
	                ANS_NUM = 0;
	                ANS_DEM = 0;
	                
	                NUM = "";
	                DEM = "";
	                
	                lcm = 0;
	                gcd = 0;
	                
	                ration1 = "";
	                ration2 = "";
	                
	                ration_1 = new String[2];
	                ration_2 = new String[2];
	                
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void RationalSubtraction() {
		
		RationalSubtraction = new ActionListener[2];
		
		RationalSubtraction[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				ration1 = IOTextField.getText();
				ration1.replaceAll(" ", "");
				
				if(isRational(ration1)) {
					
					ration_1 = ration1.split("/");
	                num1 = Integer.valueOf(ration_1[0]);
	                dem1 = Integer.valueOf(ration_1[1]);
	                
	                IOTextField.setText("");
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration1);
	                
	                IOTextArea.setText(IOTextArea.getText() + "\nEnter Smaller Rational Operand");
					
	                EnterButton.removeActionListener(RationalSubtraction[0]);
	                EnterButton.addActionListener(RationalSubtraction[1]);
	                
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		RationalSubtraction[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				ration2 = IOTextField.getText();
				ration2.replaceAll(" ", "");
				
				if(isRational(ration2)) {
					
					ration_2 = ration2.split("/");
	                num2 = Integer.valueOf(ration_2[0]);
	                dem2 = Integer.valueOf(ration_2[1]);
	                
	                IOTextField.setText("");
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration2);

	                lcm = (dem1 > dem2) ? dem1 : dem2;
	                
	                while(true) {
	                	
	                    if( lcm % dem1 == 0 && lcm % dem2 == 0 ) {
	                       
	                    	break;
	                    	
	                    }
	                    
	                    ++lcm;
	                }

	                Ans_dem = lcm;
	                Ans_num = (lcm / dem1) * num1 - (lcm / dem2) * num2;

	                gcd = 1;
	                
	                if(Math.abs(Ans_num) == Math.abs(Ans_dem)) {
	                	
	                	gcd = Ans_num;
	                	
	                }
	                
	                if(Ans_num >= 0) {
	                
		                for(int i = 1; i <= Ans_num && i <= Ans_dem; ++i) {
		                
		                    if(Ans_num % i == 0 && Ans_dem % i == 0) {
		                    
		                        gcd = i;
		                    }
		                    
		                }
		                
	                }
	                else {
	                
	                	for(int i = 1; i >= Ans_num && i <= Ans_dem; --i) {
		                
		                    if(Ans_num % i == 0 && Ans_dem % i == 0) {
		                    
		                        gcd = i * -1;
		                        
		                    }
		                    
		                }
	                	
	                }
	                
	                ANS_NUM = Ans_num / gcd;
	                ANS_DEM = Ans_dem / gcd;
	                
	                NUM = String.valueOf(ANS_NUM);
	                DEM = String.valueOf(ANS_DEM);
	                
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration1 + " - " + ration2 + " = ");
	                IOTextArea.setText(IOTextArea.getText() + NUM + "/" + DEM);
	                
	                EnterButton.removeActionListener(RationalSubtraction[1]);
	                
	                num1 = 0;
	                dem1 = 0;
	                
	                num2 = 0;
	                dem2 = 0;
	                
	                Ans_num = 0;
	                Ans_dem = 0;
	                
	                ANS_NUM = 0;
	                ANS_DEM = 0;
	                
	                NUM = "";
	                DEM = "";
	                
	                lcm = 0;
	                gcd = 0;
	                
	                ration1 = "";
	                ration2 = "";
	                
	                ration_1 = new String[2];
	                ration_2 = new String[2];
	                
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void RationalMultiplication() {
		
		RationalMultiplication = new ActionListener[2];
		
		RationalMultiplication[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				ration1 = IOTextField.getText();
				ration1.replaceAll(" ", "");
				
				if(isRational(ration1)) {
					
					ration_1 = ration1.split("/");
	                num1 = Integer.valueOf(ration_1[0]);
	                dem1 = Integer.valueOf(ration_1[1]);
	                
	                IOTextField.setText("");
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration1);
	                
	                IOTextArea.setText(IOTextArea.getText() + "\nEnter 2nd Rational Operand");
					
	                EnterButton.removeActionListener(RationalMultiplication[0]);
	                EnterButton.addActionListener(RationalMultiplication[1]);
	                
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		RationalMultiplication[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				ration2 = IOTextField.getText();
				ration2.replaceAll(" ", "");
				
				if(isRational(ration2)) {
					
					ration_2 = ration2.split("/");
	                num2 = Integer.valueOf(ration_2[0]);
	                dem2 = Integer.valueOf(ration_2[1]);
	                
	                IOTextField.setText("");
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration2);

	                lcm = (dem1 > dem2) ? dem1 : dem2;
	                
	                while(true) {
	                	
	                    if( lcm % dem1 == 0 && lcm % dem2 == 0 ) {
	                       
	                    	break;
	                    	
	                    }
	                    
	                    ++lcm;
	                    
	                }

	                Ans_dem = dem1 * dem2;
	                Ans_num = num1 * num2;

	                gcd = 1;
	                
	                if(Math.abs(Ans_num) == Math.abs(Ans_dem)) {
	                	
	                	gcd = Ans_num;
	                	
	                }
	                
	                if(Ans_num >= 0) {
	                
		                for(int i = 1; i <= Ans_num && i <= Ans_dem; ++i) {
		                
		                    if(Ans_num % i == 0 && Ans_dem % i == 0) {
		                    
		                        gcd = i;
		                        
		                    }
		                    
		                }
		                
	                }
	                else {
	                	
	                	for(int i = 1; i >= Ans_num && i <= Ans_dem; --i) {
		                
		                    if(Ans_num % i == 0 && Ans_dem % i == 0) {
		                    
		                        gcd = i * -1;
		                        
		                    }
		                    
		                }
	                	
	                }
	                
	                ANS_NUM = Ans_num / gcd;
	                ANS_DEM = Ans_dem / gcd;
	                
	                NUM = String.valueOf(ANS_NUM);
	                DEM = String.valueOf(ANS_DEM);
	                
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration1 + " × " + ration2 + " = ");
	                IOTextArea.setText(IOTextArea.getText() + NUM + "/" + DEM);
	                
	                EnterButton.removeActionListener(RationalMultiplication[1]);
	                
	                num1 = 0;
	                dem1 = 0;
	                
	                num2 = 0;
	                dem2 = 0;
	                
	                Ans_num = 0;
	                Ans_dem = 0;
	                
	                ANS_NUM = 0;
	                ANS_DEM = 0;
	                
	                NUM = "";
	                DEM = "";
	                
	                lcm = 0;
	                gcd = 0;
	                
	                ration1 = "";
	                ration2 = "";
	                
	                ration_1 = new String[2];
	                ration_2 = new String[2];
	                
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void RationalDivision() {
		
		RationalDivision = new ActionListener[2];
		
		RationalDivision[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				ration1 = IOTextField.getText();
				ration1.replaceAll(" ", "");
				
				if(isRational(ration1)) {
					
					ration_1 = ration1.split("/");
	                num1 = Integer.valueOf(ration_1[0]);
	                dem1 = Integer.valueOf(ration_1[1]);
	                
	                IOTextField.setText("");
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration1);
	                
	                IOTextArea.setText(IOTextArea.getText() + "\nEnter Rational Divisor Operand");
					
	                EnterButton.removeActionListener(RationalDivision[0]);
	                EnterButton.addActionListener(RationalDivision[1]);
	                
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		RationalDivision[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				ration2 = IOTextField.getText();
				ration2.replaceAll(" ", "");
				
				if(isRational(ration2)) {
					
					ration_2 = ration2.split("/");
	                num2 = Integer.valueOf(ration_2[0]);
	                dem2 = Integer.valueOf(ration_2[1]);
	                
	                IOTextField.setText("");
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration2);

	                lcm = (dem1 > dem2) ? dem1 : dem2;
	                
	                while(true) {
	                	
	                    if( lcm % dem1 == 0 && lcm % dem2 == 0 ) {
	                       
	                    	break;
	                    	
	                    }
	                    
	                    ++lcm;
	                    
	                }

	                Ans_dem = dem1 * num2;
	                Ans_num = num1 * dem2;

	                gcd = 1;
	                
	                if(Math.abs(Ans_num) == Math.abs(Ans_dem)) {
	                	
	                	gcd = Ans_num;
	                	
	                }
	                
	                if(Ans_num >= 0) {
	                
		                for(int i = 1; i <= Ans_num && i <= Ans_dem; ++i) {
		                
		                    if(Ans_num % i == 0 && Ans_dem % i == 0) {
		                    
		                        gcd = i;
		                        
		                    }
		                    
		                }
		                
	                }
	                else {
	                	
	                	for(int i = 1; i >= Ans_num && i <= Ans_dem; --i) {
		                
		                    if(Ans_num % i == 0 && Ans_dem % i == 0) {
		                    
		                        gcd = i * -1;
		                        
		                    }
		                    
		                }
	                	
	                }
	                
	                ANS_NUM = Ans_num / gcd;
	                ANS_DEM = Ans_dem / gcd;
	                
	                NUM = String.valueOf(ANS_NUM);
	                DEM = String.valueOf(ANS_DEM);
	                
	                IOTextArea.setText(IOTextArea.getText() + "\n" + ration1 + " ÷ " + ration2 + " = ");
	                IOTextArea.setText(IOTextArea.getText() + NUM + "/" + DEM);
	                
	                EnterButton.removeActionListener(RationalDivision[1]);
	                
	                num1 = 0;
	                dem1 = 0;
	                
	                num2 = 0;
	                dem2 = 0;
	                
	                Ans_num = 0;
	                Ans_dem = 0;
	                
	                ANS_NUM = 0;
	                ANS_DEM = 0;
	                
	                NUM = "";
	                DEM = "";
	                
	                lcm = 0;
	                gcd = 0;
	                
	                ration1 = "";
	                ration2 = "";
	                
	                ration_1 = new String[2];
	                ration_2 = new String[2];
	                
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void Exponentiation() {
		
		Exponentiation = new ActionListener[2];
		
		Exponentiation[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Power Operand");
					
					EnterButton.removeActionListener(Exponentiation[0]);
					EnterButton.addActionListener(Exponentiation[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Exponentiation[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
						
						c = Math.pow(a,b);
						
						c0 = String.valueOf(c);
						
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = Math.pow(a, b);
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA * (int)b;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = Math.pow(a, b);
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						
						if(b >= 5) {
							
							LengthC = (LengthA * (int)b);
						
						}
						else {
							
							LengthC = (LengthA * (int)b) + LengthB;
							
						}
						
						if(LengthC > 8) {
							
							LengthC = 8;
							
						}
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = Math.pow(a, b);
						
						c0 = String.format("%." + LengthC + "f", c);
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0 + " ^ " + b0 + " = " + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(Exponentiation[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void SimpleInterest() {
		
		SimpleInterest = new ActionListener[3];
		
		SimpleInterest[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Rate Of Interest per annum");
					
					EnterButton.removeActionListener(SimpleInterest[0]);
					EnterButton.addActionListener(SimpleInterest[1]);
					
				}
				else {
					
					error();
					
				}
			}
			
		};
		
		SimpleInterest[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Time Period");
					
					EnterButton.removeActionListener(SimpleInterest[1]);
					EnterButton.addActionListener(SimpleInterest[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		SimpleInterest[2] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				c0 = IOTextField.getText();
				c0.replaceAll(" ", "");
				
				if(isDouble(c0)) {
					
					c = Double.valueOf(c0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + c0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
					}
					else {
						
						LengthA = 0;
						
					}
					
					if(!isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						
					}
					else {
						
						LengthB = 0;
						
					}

					if(!isInteger(c0)) {
						
						LengthC = c0.split("\\.")[1].length();
						
					}
					else {
						
						LengthC = 0;
						
					}

					LengthE = LengthA + LengthB + LengthC;
					
					decimalFormat = new DecimalFormat();
					decimalFormat.setMaximumFractionDigits(LengthE);
					
					e = (a * b * c) / 100;
					
					e0 = String.valueOf(decimalFormat.format(e));
					
					IOTextArea.setText(IOTextArea.getText() + "\nSimple Interest = " + e0);
					
					e += a;
					
					e0 = String.valueOf(decimalFormat.format(e));
					
					IOTextArea.setText(IOTextArea.getText() + "\nAmount = " + e0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					d0 = "";
					e0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					d = 0.0d;
					e = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					LengthD = 0;
					LengthE = 0;
					
					EnterButton.removeActionListener(SimpleInterest[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void CompoundInterest() {
		
		CompoundInterest = new ActionListener[4];
		
		CompoundInterest[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Rate Of Interest per annum");
					
					EnterButton.removeActionListener(CompoundInterest[0]);
					EnterButton.addActionListener(CompoundInterest[1]);
					
				}
				else {
					
					error();
					
				}
			}
			
		};
		
		CompoundInterest[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Time Period");
					
					EnterButton.removeActionListener(CompoundInterest[1]);
					EnterButton.addActionListener(CompoundInterest[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		CompoundInterest[2] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				c0 = IOTextField.getText();
				c0.replaceAll(" ", "");
				
				if(isDouble(c0)) {
					
					c = Double.valueOf(c0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + c0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter No.of compounding periods per annum");
					
					EnterButton.removeActionListener(CompoundInterest[2]);
					EnterButton.addActionListener(CompoundInterest[3]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		CompoundInterest[3] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				d0 = IOTextField.getText();
				d0.replaceAll(" ", "");
				
				if(isInteger(d0)) {
					
					d = Integer.valueOf(d0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + d0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
					}
					else {
						
						LengthA = 0;
						
					}
					
					if(!isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						
					}
					else {
						
						LengthB = 0;
						
					}

					if(!isInteger(c0)) {
						
						LengthC = c0.split("\\.")[1].length();
						
					}
					else {
						
						LengthC = 0;
						
					}

					LengthE = LengthA + LengthB + LengthC;
					
					decimalFormat = new DecimalFormat();
					decimalFormat.setMaximumFractionDigits(LengthE);
					
					e =  a *(Math.pow(1.0 + (b / (100.0 * d)), (d * c))) - a;
					
					e0 = String.valueOf(decimalFormat.format(e));
					
					IOTextArea.setText(IOTextArea.getText() + "\nCompound Interest = " + e0);
					
					e += a;
					
					e0 = String.valueOf(decimalFormat.format(e));
					
					IOTextArea.setText(IOTextArea.getText() + "\nAmount = " + e0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					d0 = "";
					e0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					d = 0.0d;
					e = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					LengthD = 0;
					LengthE = 0;
					
					EnterButton.removeActionListener(CompoundInterest[3]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void Logarithm() {
		
		Logarithm = new ActionListener[2];
		
		Logarithm[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {

				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Power Operand");
					
					EnterButton.removeActionListener(Logarithm[0]);
					EnterButton.addActionListener(Logarithm[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Logarithm[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {

				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						
						c = Math.log(a) / Math.log(b);
						
						c0 = String.valueOf(c);
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = Math.log(a) / Math.log(b);
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = Math.log(a) / Math.log(b);
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthA + LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = Math.log(a) / Math.log(b);
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nlog " + a0 + " to the power " + b + " = ");
					IOTextArea.setText(IOTextArea.getText() + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(Logarithm[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void SetUnion() {
		
		Union = new ActionListener[4];
		
		Union[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isInteger(a0) && (Integer.valueOf(a0) > 0)) {
					
					a = Integer.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Element [1]");
					
					i = 1;
					
					EnterButton.removeActionListener(Union[0]);
					EnterButton.addActionListener(Union[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Union[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				e0 = IOTextField.getText();
				e0.replaceAll(" ","");
				
				if(isDouble(e0)) {
					
					e = Double.valueOf(e0);
					
					A.add(e);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + e0);
					
					i++;
					
					if((i - a) == 1) {
						
						IOTextArea.setText(IOTextArea.getText() + "\nEnter no.of Elements in Set [B]");
						
						a0 = "";
						a = 0.0d;
						
						EnterButton.removeActionListener(Union[1]);
						EnterButton.addActionListener(Union[2]);
						
					}
					else {
						
						IOTextArea.setText(IOTextArea.getText() + "\nEnter Element [" + i + "]");
						
					}
					
					e = 0.0d;;
					e0 = "";
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Union[2] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isInteger(b0) && (Integer.valueOf(b0) > 0)) {
					
					b = Integer.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Element [1]");
					
					i = 1;
					
					EnterButton.removeActionListener(Union[2]);
					EnterButton.addActionListener(Union[3]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Union[3] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				e0 = IOTextField.getText();
				e0.replaceAll(" ","");
				
				if(isDouble(e0)) {
					
					e = Double.valueOf(e0);
					
					B.add(e);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + e0);
					
					i++;
					
					if((i - b) == 1) {
						
						C.addAll(A);
						C.addAll(B);
						
						IOTextArea.setText(IOTextArea.getText() + "\n" + A + " U " + B + " = " + C);
						
						b0 = "";
						b = 0.0d;
						
						A.clear();
						B.clear();
						C.clear();
						
						EnterButton.removeActionListener(Union[3]);

					}
					else {
						
						IOTextArea.setText(IOTextArea.getText() + "\nEnter Element [" + i + "]");
						
					}
					
					e = 0.0d;;
					e0 = "";
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void SetIntersection() {
		
		Intersection = new ActionListener[4];
		
		Intersection[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isInteger(a0) && (Integer.valueOf(a0) > 0)) {
					
					a = Integer.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Element [1]");
					
					i = 1;
					
					EnterButton.removeActionListener(Intersection[0]);
					EnterButton.addActionListener(Intersection[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Intersection[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				e0 = IOTextField.getText();
				e0.replaceAll(" ","");
				
				if(isDouble(e0)) {
					
					e = Double.valueOf(e0);
					
					A.add(e);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + e0);
					
					i++;
					
					if((i - a) == 1) {
						
						IOTextArea.setText(IOTextArea.getText() + "\nEnter no.of Elements in Set [B]");
						
						a0 = "";
						a = 0.0d;
						
						EnterButton.removeActionListener(Intersection[1]);
						EnterButton.addActionListener(Intersection[2]);
						
					}
					else {
						
						IOTextArea.setText(IOTextArea.getText() + "\nEnter Element [" + i + "]");
						
					}
					
					e = 0.0d;;
					e0 = "";
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Intersection[2] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isInteger(b0) && (Integer.valueOf(b0) > 0)) {
					
					b = Integer.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Element [1]");
					
					i = 1;
					
					EnterButton.removeActionListener(Intersection[2]);
					EnterButton.addActionListener(Intersection[3]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		Intersection[3] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				e0 = IOTextField.getText();
				e0.replaceAll(" ","");
				
				if(isDouble(e0)) {
					
					e = Double.valueOf(e0);
					
					B.add(e);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + e0);
					
					i++;
					
					if((i - b) == 1) {
						
						C.addAll(A);
						C.retainAll(B);
						
						if(C.isEmpty()) {
							
							IOTextArea.setText(IOTextArea.getText() + "\n" + A + " ∩ " + B + " = " + "NaN");
							
						}
						else {
							
							IOTextArea.setText(IOTextArea.getText() + "\n" + A + " ∩ " + B + " = " + C);
						
						}
						
						b0 = "";
						b = 0.0d;
						
						A.clear();
						B.clear();
						C.clear();
						
						EnterButton.removeActionListener(Intersection[3]);

					}
					else {
						
						IOTextArea.setText(IOTextArea.getText() + "\nEnter Element [" + i + "]");
						
					}
					
					e = 0.0d;;
					e0 = "";
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void EquilateralTriangleAreaBaseHeight() {
		
		EquilateralTriangleAreaBaseHeight = new ActionListener[2];
		
		EquilateralTriangleAreaBaseHeight[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Height Operand");
					
					EnterButton.removeActionListener(EquilateralTriangleAreaBaseHeight[0]);
					EnterButton.addActionListener(EquilateralTriangleAreaBaseHeight[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		EquilateralTriangleAreaBaseHeight[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
				
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(c);
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB + 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA + 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthA + LengthB + 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nArea of Equilateral Triangle = " + c0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(EquilateralTriangleAreaBaseHeight[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void  EquilateralTriangleAreaSides() {
		
		EquilateralTriangleAreaSides = new ActionListener[1];
		
		EquilateralTriangleAreaSides[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					if(isInteger(a0)) {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(5);
						
						b = ((Math.sqrt(3.0)) / 4.0 * (a * a));
						
						b0 = String.valueOf(decimalFormat.format(b));;
						
					}
					else {

						LengthA = a0.split("\\.")[1].length();
						LengthB = (LengthA * 3) + 3;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b = ((Math.sqrt(3.0)) / 4.0 * (a * a));
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nArea of Equilateral Triangle = " + b0);
					
					a = 0.0d;
					b = 0.0d;
					
					a0 = "";
					b0 = "";
					
					LengthA = 0;
					LengthB = 0;
					
					EnterButton.removeActionListener(EquilateralTriangleAreaSides[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void  EquilateralTrianglePerimeter() {
		
		EquilateralTrianglePerimeter = new ActionListener[1];
		
		EquilateralTrianglePerimeter[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					if(isInteger(a0)) {
						
						b = a * 3.0;
						
						b0 = String.valueOf(b);
						
					}
					else {

						LengthA = a0.split("\\.")[1].length();
						LengthB = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b = a * 3.0;
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nPerimeter of Equilateral Triangle = " + b0);
					
					a = 0.0d;
					b = 0.0d;
					
					a0 = "";
					b0 = "";
					
					LengthA = 0;
					LengthB = 0;
					
					EnterButton.removeActionListener(EquilateralTrianglePerimeter[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void IsoscelesTriangleAreaBaseHeight() {
		
		IsoscelesTriangleAreaBaseHeight = new ActionListener[2];
		
		IsoscelesTriangleAreaBaseHeight[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Height Operand");
					
					EnterButton.removeActionListener(IsoscelesTriangleAreaBaseHeight[0]);
					EnterButton.addActionListener(IsoscelesTriangleAreaBaseHeight[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		IsoscelesTriangleAreaBaseHeight[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
				
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(c);
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB + 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA + 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthA + LengthB + 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nArea of Isosceles Triangle = " + c0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(IsoscelesTriangleAreaBaseHeight[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void IsoscelesTriangleAreaSides() {
		
		IsoscelesTriangleAreaSides = new ActionListener[2];
		
		IsoscelesTriangleAreaSides[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Base Side Operand");
					
					EnterButton.removeActionListener(IsoscelesTriangleAreaSides[0]);
					EnterButton.addActionListener(IsoscelesTriangleAreaSides[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		IsoscelesTriangleAreaSides[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(5);
						
						c = b / 2.0 * (Math.sqrt((a * a) - (( b * b) / 4.0)));
						
						c0 = String.valueOf(decimalFormat.format(c));
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB + 3;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = b / 2.0 * (Math.sqrt((a * a) - (( b * b) / 4.0)));
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA + 3;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = b / 2.0 * (Math.sqrt((a * a) - (( b * b) / 4.0)));
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthA + LengthB + 3;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = b / 2.0 * (Math.sqrt((a * a) - (( b * b) / 4.0)));
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nArea of Isosceles Triangle = " + c0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(IsoscelesTriangleAreaSides[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void IsoscelesTrianglePerimeter() {
		
		IsoscelesTrianglePerimeter = new ActionListener[2];
		
		IsoscelesTrianglePerimeter[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Base Side Operand");
					
					EnterButton.removeActionListener(IsoscelesTrianglePerimeter[0]);
					EnterButton.addActionListener(IsoscelesTrianglePerimeter[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		IsoscelesTrianglePerimeter[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						
						c = a + b + a;
						
						c0 = String.valueOf(c);
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a + b + a;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a + b + a;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = (LengthA > LengthB ? LengthA : LengthB);
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a + b + a;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nPerimeter of Isosceles Triangle = " + c0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(IsoscelesTrianglePerimeter[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}

	public void ScaleneTriangleAreaBaseHeight() {
		
		ScaleneTriangleAreaBaseHeight = new ActionListener[2];
		
		ScaleneTriangleAreaBaseHeight[0] = new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Height Operand");
					
					EnterButton.removeActionListener(ScaleneTriangleAreaBaseHeight[0]);
					EnterButton.addActionListener(ScaleneTriangleAreaBaseHeight[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		ScaleneTriangleAreaBaseHeight[1] = new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
				
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(c);
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB + 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA + 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthA + LengthB + 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nArea of Scalene Triangle = " + c0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(ScaleneTriangleAreaBaseHeight[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void ScaleneTriangleAreaSides() {
		
		ScaleneTriangleAreaSides = new ActionListener[3];
		
		ScaleneTriangleAreaSides[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter 2nd Side Operand");
					
					EnterButton.removeActionListener(ScaleneTriangleAreaSides[0]);
					EnterButton.addActionListener(ScaleneTriangleAreaSides[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		ScaleneTriangleAreaSides[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
				
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter 3rd Side Operand");
					
					EnterButton.removeActionListener(ScaleneTriangleAreaSides[1]);
					EnterButton.addActionListener(ScaleneTriangleAreaSides[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		ScaleneTriangleAreaSides[2] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				c0 = IOTextField.getText();
				c0.replaceAll(" ","");
				
				if(isDouble(c0)) {
				
					c = Double.valueOf(c0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + c0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(c0)) {
						
						LengthC = c0.split("\\.")[1].length();
						
					}
					
					LengthE = LengthA + LengthB + LengthC;
					
					if(LengthE <= 5) {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(5);
						
					}
					else {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthE);
						
					}
					
					d = (a + b + c) / 2.0;
                    e = Math.sqrt(d * (d - a) * (d - b) * (d - c));
                    
                    e0 = String.valueOf(decimalFormat.format(e));
                    
                    IOTextArea.setText(IOTextArea.getText() + "\nArea of Scalene Triangle = " + e0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					d = 0.0d;
					e = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					d0 = "";
					e0 = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					LengthD = 0;
					LengthE = 0;
					
					EnterButton.removeActionListener(ScaleneTriangleAreaSides[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void ScaleneTrianglePerimeter() {
		
		ScaleneTrianglePerimeter = new ActionListener[3];
		
		ScaleneTrianglePerimeter[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter 2nd Side Operand");
					
					EnterButton.removeActionListener(ScaleneTrianglePerimeter[0]);
					EnterButton.addActionListener(ScaleneTrianglePerimeter[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		ScaleneTrianglePerimeter[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
				
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter 3rd Side Operand");
					
					EnterButton.removeActionListener(ScaleneTrianglePerimeter[1]);
					EnterButton.addActionListener(ScaleneTrianglePerimeter[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		ScaleneTrianglePerimeter[2] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				c0 = IOTextField.getText();
				c0.replaceAll(" ","");
				
				if(isDouble(c0)) {
				
					c = Double.valueOf(c0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + c0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(c0)) {
						
						LengthC = c0.split("\\.")[1].length();
						
					}
					
					e = a + b + c;
					
					LengthE = 1;
					
					LengthE = (LengthA > LengthE) ? LengthA : LengthE;
					LengthE = (LengthB > LengthE) ? LengthB : LengthE;
					LengthE = (LengthC > LengthE) ? LengthC : LengthE;

					decimalFormat = new DecimalFormat();
					decimalFormat.setMaximumFractionDigits(LengthE);
                    
                    e0 = String.valueOf(decimalFormat.format(e));
                    
                    IOTextArea.setText(IOTextArea.getText() + "\nPerimeter of Scalene Triangle = " + e0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					d = 0.0d;
					e = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					d0 = "";
					e0 = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					LengthD = 0;
					LengthE = 0;
					
					EnterButton.removeActionListener(ScaleneTrianglePerimeter[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void FullCircleArea() {
		
		FullCircleArea = new ActionListener[1];
		
		FullCircleArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					LengthB = 2;
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();

						LengthB += (LengthA * 2);
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
					}
					else {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
					}
					
					b = (Math.PI * (a * a));
					
					b0 = String.valueOf(decimalFormat.format(b));
					
					IOTextArea.setText(IOTextArea.getText() + "\nArea of Full Circle = " + b0);
					
					a0 = "";
					b0 = "";
					
					a = 0.0d;
					b = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					
					EnterButton.removeActionListener(FullCircleArea[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void FullCircleCircumference() {
		
		FullCircleCircumference = new ActionListener[1];
		
		FullCircleCircumference[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					LengthB = 2;
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();

						LengthB += LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
					}
					else {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
					}
					
					b = (Math.PI * 2.0 * a);
					
					b0 = String.valueOf(decimalFormat.format(b));
					
					IOTextArea.setText(IOTextArea.getText() + "\nCircumference of Full Circle = " + b0);
					
					a0 = "";
					b0 = "";
					
					a = 0.0d;
					b = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					
					EnterButton.removeActionListener(FullCircleCircumference[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void SemiCircleArea() {
		
		SemiCircleArea = new ActionListener[1];
		
		SemiCircleArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					LengthB = 3;
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();

						LengthB += (LengthA * 2);
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
					}
					else {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
					}
					
					b = (Math.PI * (a * a)) / 2.0;
					
					b0 = String.valueOf(decimalFormat.format(b));
					
					IOTextArea.setText(IOTextArea.getText() + "\nArea of Semi Circle = " + b0);
					
					a0 = "";
					b0 = "";
					
					a = 0.0d;
					b = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					
					EnterButton.removeActionListener(SemiCircleArea[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void SemiCircleCircumference() {
		
		SemiCircleCircumference = new ActionListener[1];
		
		SemiCircleCircumference[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					LengthB = 2;
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();

						LengthB += LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
					}
					else {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
					}
					
					b = (Math.PI * a);
					
					b0 = String.valueOf(decimalFormat.format(b));
					
					IOTextArea.setText(IOTextArea.getText() + "\nCircumference of Semi Circle = " + b0);
					
					a0 = "";
					b0 = "";
					
					a = 0.0d;
					b = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					
					EnterButton.removeActionListener(SemiCircleCircumference[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void SemiCirclePerimeter() {
		
		SemiCirclePerimeter = new ActionListener[1];
		
		SemiCirclePerimeter[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					LengthB = 2;
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();

						LengthB += LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
					}
					else {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
					}
					
					b = (Math.PI * a) + (2.0 * a);
					
					b0 = String.valueOf(decimalFormat.format(b));
					
					IOTextArea.setText(IOTextArea.getText() + "\nPerimeter of Semi Circle = " + b0);
					
					a0 = "";
					b0 = "";
					
					a = 0.0d;
					b = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					
					EnterButton.removeActionListener(SemiCirclePerimeter[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void RectangleArea() {
		
		RectangleArea = new ActionListener[2];
		
		RectangleArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Breadth Operand");
					
					EnterButton.removeActionListener(RectangleArea[0]);
					EnterButton.addActionListener(RectangleArea[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		RectangleArea[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						LengthC = 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a * b;
						
						c0 = String.valueOf(decimalFormat.format(c));
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a * b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a * b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthA + LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a * b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nArea of Rectangle = " + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(RectangleArea[1]);
					
				}
				else {
						
					error();
					
				}
				
			}
			
		};
											
	}
	
	public void RectanglePerimeter() {

		RectanglePerimeter = new ActionListener[2];
		
		RectanglePerimeter[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Breadth Operand");
					
					EnterButton.removeActionListener(RectanglePerimeter[0]);
					EnterButton.addActionListener(RectanglePerimeter[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		RectanglePerimeter[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						LengthC = 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = (LengthA > LengthB) ? LengthA : LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nPerimeter of Rectangle = " + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(RectanglePerimeter[1]);
					
				}
				else {
						
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void SquareArea() {
		
		SquareArea = new ActionListener[1];
		
		SquareArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
						LengthB = LengthA * 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b = a * a;
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					else {
						
						LengthB = 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b = a * a;
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nArea of the Square = " + b0);
					
					a = 0.0;
					b = 0.0;
					
					LengthA = 0;
					LengthB = 0;
					
					a0 = "";
					b0 = "";
					
					EnterButton.removeActionListener(SquareArea[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void SquarePerimeter() {
		
		SquarePerimeter = new ActionListener[1];
		
		SquarePerimeter[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
						LengthB = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b = 4.0 * a;
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					else {
						
						LengthB = 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b = 4.0 * a;
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nPerimeter of the Square = " + b0);
					
					a = 0.0;
					b = 0.0;
					
					LengthA = 0;
					LengthB = 0;
					
					a0 = "";
					b0 = "";
					
					EnterButton.removeActionListener(SquarePerimeter[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void RhombusArea() {
		
		RhombusArea = new ActionListener[2];
		
		RhombusArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter 2nd Diagonal Operand");
					
					EnterButton.removeActionListener(RhombusArea[0]);
					EnterButton.addActionListener(RhombusArea[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		RhombusArea[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
						LengthC = 1;
					
					if(isInteger(a0) && isInteger(b0)) {
					
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC += LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC += LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC += LengthA + LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a * b) / 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nArea of Rhombus = " + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(RhombusArea[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void RhombusPerimeter() {
		
		RhombusPerimeter = new ActionListener[1];
		
		RhombusPerimeter[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
						LengthB = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b = 4.0 * a;
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					else {
						
						LengthB = 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b = 4.0 * a;
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nPerimeter of the Rhombus = " + b0);
					
					a = 0.0;
					b = 0.0;
					
					LengthA = 0;
					LengthB = 0;
					
					a0 = "";
					b0 = "";
					
					EnterButton.removeActionListener(RhombusPerimeter[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void ParallelogramArea() {
		
		ParallelogramArea = new ActionListener[2];
		
		ParallelogramArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Height Operand");
					
					EnterButton.removeActionListener(ParallelogramArea[0]);
					EnterButton.addActionListener(ParallelogramArea[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		ParallelogramArea[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						LengthC = 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a * b;
						
						c0 = String.valueOf(decimalFormat.format(c));
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a * b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a * b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthA + LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = a * b;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nArea of Parallelogram = " + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(ParallelogramArea[1]);

				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void ParallelogramPerimeter() {
		
		ParallelogramPerimeter = new ActionListener[2];
		
		ParallelogramPerimeter[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Breadth Operand");
					
					EnterButton.removeActionListener(ParallelogramPerimeter[0]);
					EnterButton.addActionListener(ParallelogramPerimeter[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		ParallelogramPerimeter[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						LengthC = 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = (LengthA > LengthB) ? LengthA : LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nPerimeter of Parallelogram = " + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(ParallelogramPerimeter[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void KiteArea() {
		
			KiteArea = new ActionListener[2];
			
			KiteArea[0] = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent ae) {
					
					a0 = IOTextField.getText();
					a0.replaceAll(" ", "");
					
					if(isDouble(a0)) {
						
						a = Double.valueOf(a0);
						
						IOTextField.setText("");
						IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
						
						IOTextArea.setText(IOTextArea.getText() + "\nEnter 2nd Diagonal Operand");
						
						EnterButton.removeActionListener(KiteArea[0]);
						EnterButton.addActionListener(KiteArea[1]);
						
					}
					else {
						
						error();
						
					}
					
				}
				
			};
			
			KiteArea[1] = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent ae) {
					
					b0 = IOTextField.getText();
					b0.replaceAll(" ", "");
					
					if(isDouble(b0)) {
						
						b = Double.valueOf(b0);
						
						IOTextField.setText("");
						IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
						
							LengthC = 1;
						
						if(isInteger(a0) && isInteger(b0)) {
						
							decimalFormat = new DecimalFormat();
							decimalFormat.setMaximumFractionDigits(LengthC);
							
							c = (a * b) / 2.0;
							
							c0 = String.valueOf(decimalFormat.format(c));
						
						}
						else if(isInteger(a0) && !isInteger(b0)) {
							
							LengthB = b0.split("\\.")[1].length();
							LengthC += LengthB;
							
							decimalFormat = new DecimalFormat();
							decimalFormat.setMaximumFractionDigits(LengthC);
							
							c = (a * b) / 2.0;
							
							c0 = String.valueOf(decimalFormat.format(c));
							
						}
						else if(!isInteger(a0) && isInteger(b0)) {
							
							LengthA = a0.split("\\.")[1].length();
							LengthC += LengthA;
							
							decimalFormat = new DecimalFormat();
							decimalFormat.setMaximumFractionDigits(LengthC);
							
							c = (a * b) / 2.0;
							
							c0 = String.valueOf(decimalFormat.format(c));
							
						}
						else if(!isInteger(a0) && !isInteger(b0)){
							
							LengthA = a0.split("\\.")[1].length();
							LengthB = b0.split("\\.")[1].length();
							LengthC += LengthA + LengthB;
							
							decimalFormat = new DecimalFormat();
							decimalFormat.setMaximumFractionDigits(LengthC);
							
							c = (a * b) / 2.0;
							
							c0 = String.valueOf(decimalFormat.format(c));
							
						}
						
						IOTextArea.setText(IOTextArea.getText() + "\nArea of Kite = " + c0);
						
						a0 = "";
						b0 = "";
						c0 = "";
						
						a = 0.0d;
						b = 0.0d;
						c = 0.0d;
						
						LengthA = 0;
						LengthB = 0;
						LengthC = 0;
						
						EnterButton.removeActionListener(KiteArea[1]);
						
					}
					else {
						
						error();
						
					}
					
				}
				
			};
		
	}
	
	public void KitePerimeter() {
		
		KitePerimeter = new ActionListener[2];
		
		KitePerimeter[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Longer Side Operand");
					
					EnterButton.removeActionListener(KitePerimeter[0]);
					EnterButton.addActionListener(KitePerimeter[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		KitePerimeter[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ", "");
				
				if(isDouble(b0)) {
					
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					if(isInteger(a0) && isInteger(b0)) {
					
						LengthC = 1;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
					
					}
					else if(isInteger(a0) && !isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						LengthC = LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && isInteger(b0)) {
						
						LengthA = a0.split("\\.")[1].length();
						LengthC = LengthA;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					else if(!isInteger(a0) && !isInteger(b0)){
						
						LengthA = a0.split("\\.")[1].length();
						LengthB = b0.split("\\.")[1].length();
						LengthC = (LengthA > LengthB) ? LengthA : LengthB;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthC);
						
						c = (a + b) * 2.0;
						
						c0 = String.valueOf(decimalFormat.format(c));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nPerimeter of Kite = " + c0);
					
					a0 = "";
					b0 = "";
					c0 = "";
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					
					EnterButton.removeActionListener(KitePerimeter[1]);
					
				}
				else {
						
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void CubeLateralSurfaceArea() {
		
		CubeLateralSurfaceArea = new ActionListener[1];
		
		CubeLateralSurfaceArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
						LengthB = LengthA * 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b =  4.0 * (a * a);
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					else {
						
						LengthB = 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b =  4.0 * (a * a);
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nLateral Surface Area of Cube = " + b0);
					
					a = 0.0d;
					b = 0.0d;
					
					a0 = "";
					b0 = "";
					
					LengthA = 0;
					LengthB = 0;
					
					EnterButton.removeActionListener(CubeLateralSurfaceArea[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void CubeTotalSurfaceArea() {
		
		CubeTotalSurfaceArea = new ActionListener[1];
		
		CubeTotalSurfaceArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
						LengthB = LengthA * 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b =  6.0 * (a * a);
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					else {
						
						LengthB = 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b =  6.0 * (a * a);
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nTotal Surface Area of Cube = " + b0);
					
					a = 0.0d;
					b = 0.0d;
					
					a0 = "";
					b0 = "";
					
					LengthA = 0;
					LengthB = 0;
					
					EnterButton.removeActionListener(CubeTotalSurfaceArea[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
				
		};
		
	}
	
	public void CubeVolume() {
		
		CubeVolume = new ActionListener[1];
		
		CubeVolume[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
						LengthB = LengthA * 3;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b =  a * a * a;
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					else {
						
						LengthB = 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b =  a * a * a;
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nVolume of Cube = " + b0);
					
					a = 0.0d;
					b = 0.0d;
					
					a0 = "";
					b0 = "";
					
					LengthA = 0;
					LengthB = 0;
					
					EnterButton.removeActionListener(CubeVolume[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void CubePerimeter() {
		
		CubePerimeter = new ActionListener[1];
		
		CubePerimeter[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ", "");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
						LengthB = LengthA * 3;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b =  12.0 * a;
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					else {
						
						LengthB = 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthB);
						
						b =  12.0 * a;
						
						b0 = String.valueOf(decimalFormat.format(b));
						
					}
					
					IOTextArea.setText(IOTextArea.getText() + "\nPerimeter of Cube = " + b0);
					
					a = 0.0d;
					b = 0.0d;
					
					a0 = "";
					b0 = "";
					
					LengthA = 0;
					LengthB = 0;
					
					EnterButton.removeActionListener(CubePerimeter[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void CuboidLateralSurfaceArea() {
		
		CuboidLateralSurfaceArea = new ActionListener[3];
		
		CuboidLateralSurfaceArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Breadth Operand");
					
					EnterButton.removeActionListener(CuboidLateralSurfaceArea[0]);
					EnterButton.addActionListener(CuboidLateralSurfaceArea[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		CuboidLateralSurfaceArea[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
				
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Height Operand");
					
					EnterButton.removeActionListener(CuboidLateralSurfaceArea[1]);
					EnterButton.addActionListener(CuboidLateralSurfaceArea[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		CuboidLateralSurfaceArea[2] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				c0 = IOTextField.getText();
				c0.replaceAll(" ","");
				
				if(isDouble(c0)) {
				
					c = Double.valueOf(c0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + c0);
					
					LengthA = 1;
					LengthB = 1;
					LengthC = 0;
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(c0)) {
						
						LengthC = c0.split("\\.")[1].length();
						
					}
					
					LengthB = (LengthB >= LengthA) ? LengthB : LengthA;
					LengthE = LengthB + LengthC;
					
					if(LengthE <= 5) {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(5);
						
					}
					else {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthE);
						
					}
					
					e = 2.0 * c * (a + b);
                    
                    e0 = String.valueOf(decimalFormat.format(e));
                    
                    IOTextArea.setText(IOTextArea.getText() + "\nLateral Surface Area of Cuboid = " + e0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					d = 0.0d;
					e = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					d0 = "";
					e0 = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					LengthD = 0;
					LengthE = 0;
					
					EnterButton.removeActionListener(CuboidLateralSurfaceArea[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void CuboidTotalSurfaceArea() {
		
		CuboidTotalSurfaceArea = new ActionListener[3];
		
		CuboidTotalSurfaceArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Breadth Operand");
					
					EnterButton.removeActionListener(CuboidTotalSurfaceArea[0]);
					EnterButton.addActionListener(CuboidTotalSurfaceArea[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		CuboidTotalSurfaceArea[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
				
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Height Operand");
					
					EnterButton.removeActionListener(CuboidTotalSurfaceArea[1]);
					EnterButton.addActionListener(CuboidTotalSurfaceArea[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		CuboidTotalSurfaceArea[2] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				c0 = IOTextField.getText();
				c0.replaceAll(" ","");
				
				if(isDouble(c0)) {
				
					c = Double.valueOf(c0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + c0);
					
					LengthA = 1;
					LengthB = 1;
					LengthC = 0;
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(c0)) {
						
						LengthC = c0.split("\\.")[1].length();
						
					}
					
					int A = LengthA + LengthB;
					int B = LengthB + LengthC;
					int C = LengthC + LengthA;
					
					if(A >= B && A >= C) {
						
						LengthE = A;
						
					}
					else if(B >= C && B >= A) {
						
						LengthE = B;
						
					}
					else if(C >= A && C >= B) {
						
						LengthE = C;
						
					}
					else {
						
						LengthE = 4;
						
					}
					
					if(LengthE <= 5) {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(5);
						
					}
					else {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthE);
						
					}
					
					e = 2.0 * c * (a + b);
                    
                    e0 = String.valueOf(decimalFormat.format(e));
                    
                    IOTextArea.setText(IOTextArea.getText() + "\nTotal Surface Area of Cuboid = " + e0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					d = 0.0d;
					e = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					d0 = "";
					e0 = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					LengthD = 0;
					LengthE = 0;
					
					EnterButton.removeActionListener(CuboidTotalSurfaceArea[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void CuboidVolume() {
		
		CuboidVolume = new ActionListener[3];
		
		CuboidVolume[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Breadth Operand");
					
					EnterButton.removeActionListener(CuboidVolume[0]);
					EnterButton.addActionListener(CuboidVolume[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		CuboidVolume[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
				
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Height Operand");
					
					EnterButton.removeActionListener(CuboidVolume[1]);
					EnterButton.addActionListener(CuboidVolume[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		CuboidVolume[2] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				c0 = IOTextField.getText();
				c0.replaceAll(" ","");
				
				if(isDouble(c0)) {
				
					c = Double.valueOf(c0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + c0);
					
					LengthA = 1;
					LengthB = 1;
					LengthC = 0;
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(c0)) {
						
						LengthC = c0.split("\\.")[1].length();
						
					}
					
					LengthE = LengthA + LengthB + LengthC;
					
					if(LengthE <= 5) {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(5);
						
					}
					else {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthE);
						
					}
					
					e = a * b * c;
                    
                    e0 = String.valueOf(decimalFormat.format(e));
                    
                    IOTextArea.setText(IOTextArea.getText() + "\nVolume of Cuboid = " + e0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					d = 0.0d;
					e = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					d0 = "";
					e0 = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					LengthD = 0;
					LengthE = 0;
					
					EnterButton.removeActionListener(CuboidVolume[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void CuboidPerimeter() {
		
		CuboidPerimeter = new ActionListener[3];
		
		CuboidPerimeter[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Breadth Operand");
					
					EnterButton.removeActionListener(CuboidPerimeter[0]);
					EnterButton.addActionListener(CuboidPerimeter[1]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		CuboidPerimeter[1] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				b0 = IOTextField.getText();
				b0.replaceAll(" ","");
				
				if(isDouble(b0)) {
				
					b = Double.valueOf(b0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Height Operand");
					
					EnterButton.removeActionListener(CuboidPerimeter[1]);
					EnterButton.addActionListener(CuboidPerimeter[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
		CuboidPerimeter[2] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				c0 = IOTextField.getText();
				c0.replaceAll(" ","");
				
				if(isDouble(c0)) {
				
					c = Double.valueOf(c0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + c0);
					
					LengthA = 1;
					LengthB = 1;
					LengthC = 0;
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(b0)) {
						
						LengthB = b0.split("\\.")[1].length();
						
					}
					
					if(!isInteger(c0)) {
						
						LengthC = c0.split("\\.")[1].length();
						
					}
					
					if(LengthA >= LengthB && LengthA >= LengthC) {
						
						LengthE = LengthA;
						
					}
					else if(LengthB >= LengthC && LengthB >= LengthA) {
						
						LengthE = LengthB;
						
					}
					else if(LengthC >= LengthA && LengthC >= LengthB) {
						
						LengthE = LengthC;
						
					}
					else {
						
						LengthE = 4;
						
					}
					
					if(LengthE <= 5) {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(5);
						
					}
					else {
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthE);
						
					}
					
					e = 4.0 * (a + b + c);
                    
                    e0 = String.valueOf(decimalFormat.format(e));
                    
                    IOTextArea.setText(IOTextArea.getText() + "\nPerimeter of Cuboid = " + e0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					d = 0.0d;
					e = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					d0 = "";
					e0 = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					LengthD = 0;
					LengthE = 0;
					
					EnterButton.removeActionListener(CuboidPerimeter[2]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void SphereSurfaceArea() {
		
		SphereSurfaceArea = new ActionListener[1];
		
		SphereSurfaceArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
						LengthE = (LengthA * 2) + 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthE);
						
						e = 4.0 * Math.PI * (a * a);
						
						e0 = String.valueOf(decimalFormat.format(e));
						
					}
					else {
						
						LengthE = 2;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthE);
						
						e = 4.0 * Math.PI * (a * a);
						
						e0 = String.valueOf(decimalFormat.format(e));
						
					}
					
					 IOTextArea.setText(IOTextArea.getText() + "\nSurface Area of Sphere = " + e0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					d = 0.0d;
					e = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					d0 = "";
					e0  = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					LengthD = 0;
					LengthE = 0;
					
					EnterButton.removeActionListener(SphereSurfaceArea[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void SphereVolume() {
		
		SphereVolume = new ActionListener[1];
		
		SphereVolume[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
					
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					if(!isInteger(a0)) {
						
						LengthA = a0.split("\\.")[1].length();
						
						LengthE = (LengthA * 3) + 4;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthE);
						
						e =  (4.0 / 3.0) * Math.PI * (a * a * a);
						
						e0 = String.valueOf(decimalFormat.format(e));
						
					}
					else {
						
						LengthE = 4;
						
						decimalFormat = new DecimalFormat();
						decimalFormat.setMaximumFractionDigits(LengthE);
						
						e =  (4.0 / 3.0) * Math.PI * (a * a * a);
						
						e0 = String.valueOf(decimalFormat.format(e));
						
					}
					
					 IOTextArea.setText(IOTextArea.getText() + "\nVolume of Sphere = " + e0);
					
					a = 0.0d;
					b = 0.0d;
					c = 0.0d;
					d = 0.0d;
					e = 0.0d;
					
					a0 = "";
					b0 = "";
					c0 = "";
					d0 = "";
					e0  = "";
					
					LengthA = 0;
					LengthB = 0;
					LengthC = 0;
					LengthD = 0;
					LengthE = 0;
					
					EnterButton.removeActionListener(SphereVolume[0]);
					
				}
				else {
					
					error();
					
				}
				
			}
			
		};
		
	}
	
	public void ConeLateralSurfaceArea() {
		
		ConeLateralSurfaceArea = new ActionListener[2];
		
		ConeLateralSurfaceArea[0] = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				a0 = IOTextField.getText();
				a0.replaceAll(" ","");
				
				if(isDouble(a0)) {
				
					a = Double.valueOf(a0);
					
					IOTextField.setText("");
					IOTextArea.setText(IOTextArea.getText() + "\n" + a0);
					
					IOTextArea.setText(IOTextArea.getText() + "\nEnter Vertical Height Operand");
					
					EnterButton.removeActionListener(ConeLateralSurfaceArea[0]);
					EnterButton.addActionListener(ConeLateralSurfaceArea[1]);
					
				}
				else {
					
					error();
					
				}
				
				ConeLateralSurfaceArea[1] = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent ae) {
						
						b0 = IOTextField.getText();
						b0.replaceAll(" ","");
						
						if(isDouble(b0)) {
						
							a = Double.valueOf(b0);
							
							IOTextField.setText("");
							IOTextArea.setText(IOTextArea.getText() + "\n" + b0);
							
							if(isInteger(a0) && isInteger(b0)) {
								
								LengthC = 4;
								
								decimalFormat = new DecimalFormat();
								decimalFormat.setMaximumFractionDigits(LengthC);
								
								c = Math.PI * a * (Math.sqrt((a * a) + (b * b)));
								
								c0 = String.valueOf(decimalFormat.format(c));
								
							}
							else if(!isInteger(a0) && isInteger(b0)) {
								
							LengthA = a0.split("\\.")[1].length();
							
							LengthC = 4 + (LengthA * 2);
							
							decimalFormat = new DecimalFormat();
							decimalFormat.setMaximumFractionDigits(LengthC);
							
							c = Math.PI * a * (Math.sqrt((a * a) + (b * b)));
							
							c0 = String.valueOf(decimalFormat.format(c));
								
							}
							else if(isInteger(a0) && !isInteger(b0)) {
								
								LengthB = b0.split("\\.")[1].length();
								
								LengthC = 4 + LengthB;
								
								decimalFormat = new DecimalFormat();
								decimalFormat.setMaximumFractionDigits(LengthC);
								
								c = Math.PI * a * (Math.sqrt((a * a) + (b * b)));
								
								c0 = String.valueOf(decimalFormat.format(c));
								
							}
							else if(!isInteger(a0) && !isInteger(b0)) {
								
								LengthA = a0.split("\\.")[1].length();
								LengthB = b0.split("\\.")[1].length();
								
								LengthC = 4 + LengthB + (LengthA * 2);
								
								decimalFormat = new DecimalFormat();
								decimalFormat.setMaximumFractionDigits(LengthC);
								
								c = Math.PI * a * (Math.sqrt((a * a) + (b * b)));
								
								c0 = String.valueOf(decimalFormat.format(c));
								
							}
							
							IOTextArea.setText(IOTextArea.getText() + "\nLateral Surface Area of Cone = " + c0);
							
							a0 = "";
							b0 = "";
							c0 = "";
							
							a = 0.0d;
							b = 0.0d;
							c = 0.0d;
							
							LengthA = 0;
							LengthB = 0;
							LengthC = 0;
							
							EnterButton.removeActionListener(ConeLateralSurfaceArea[1]);
							
						}
						else {
							
							error();
							
						}
						
					}
					
				};
				
			}
			
		};
		
	}
	
	public void ConeTotalSurfaceArea() {
		
		
		
	}
	
	public void ConeVolume() {
		
		
		
	}
	
	public void ConeSlantHeigth() {
		
		
		
	}
	
	public void error() {
		
		IOTextArea.setText("Invalid Input.....Try Again");
		IOTextField.setText("");
		
		for(ActionListener actionListeners : EnterButton.getActionListeners()) {
			
	        EnterButton.removeActionListener(actionListeners);
	        
	    }
		
		EnterButton.addActionListener(this);
		
	}

	@SuppressWarnings("static-access")
	public boolean isDouble(String str) {
		
		this.DoubleString = str;
		DoubleString.replaceAll(" ","");
		
		DoublePattern = DoublePattern.compile("[+-]?\\d+(\\.\\d+)?"); 
		DoubleMatcher = DoublePattern.matcher(DoubleString);
		DoublePossible = DoubleMatcher.matches();
		
		DoubleString = "";
		
		return DoublePossible;
		
	}
	
	@SuppressWarnings("static-access")
	public boolean isRational(String str) {
		
		this.RationalString = str;
		
		RationalPattern = RationalPattern.compile("[+-]?(\\d+\\/{1}\\d+)"); 
		RationalMatcher = RationalPattern.matcher(RationalString);
		RationalPossible = RationalMatcher.matches();
		
		RationalString = "";
		
		return RationalPossible;
		
	}
	
	@SuppressWarnings("static-access")
	public boolean isInteger(String str) {
		
		this.IntegerString = str;
		
		IntegerPattern = IntegerPattern.compile("[+-]?\\d+"); 
		IntegerMatcher = IntegerPattern.matcher(IntegerString);
		IntegerPossible = IntegerMatcher.matches();
		
		IntegerString = "";
		
		return IntegerPossible;
		
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Calc_GUI myGUIcalculator = new Calc_GUI();
		
	}

}
