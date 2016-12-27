package com.bad_code.tapsey.codeonetwothree.app.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import com.bad_code.tapsey.codeonetwothree.app.model.factory.conditional.CaseFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.conditional.ElseFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.conditional.IfFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.conditional.SwitchFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.datatype.BooleanDeclaratorFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.datatype.DoubleDeclaratorFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.datatype.IntDeclaratorFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.datatype.StringDeclaratorFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.loop.DoFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.loop.ForFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.loop.RepeatFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.loop.WhileFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.methods.MainMethodFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.methods.MethodDeclarationFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.AndFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.AssignmentFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.DivideFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.EqualFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.GreaterEqualFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.GreaterFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.InputFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.LessEqualFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.LessFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.ModulusFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.MultiplyFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.NotFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.OrFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.PlusFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.PostDecreamentFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.PostIncreamentFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.PreDecreamentFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.PreIncreamentFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.PrintFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.SubtractFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.ToBooleanFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.ToDoubleFactory;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.operator.ToIntFactory;

import defaultvalues.Constants;

@SuppressWarnings("serial")
public class ExpressionPanel extends JPanel{
	public ExpressionPanel() {
		
		setBackground(new Color(102, 102, 102));
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblExpressionPane = new JLabel("Sharura zvivakiso");
		lblExpressionPane.setToolTipText("Contains programming elements which can be dragged into code pane.");
		lblExpressionPane.setForeground(Color.WHITE);
		lblExpressionPane.setBackground(Color.decode(Constants.BACK_COLOR));
		lblExpressionPane.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblExpressionPane, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode(Constants.BACK_COLOR));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.RIGHT);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 12));
		tabbedPane.setForeground(new Color(255, 255, 255));
		tabbedPane.setBackground(Color.decode(Constants.BACK_COLOR));
		tabbedPane.setBorder(new LineBorder(new Color(51, 51, 51), 1, true));
		panel.add(tabbedPane, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("Begginer level elements.");
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tabbedPane.addTab("Begginer", null, scrollPane, null);
		tabbedPane.setForegroundAt(0, new Color(255, 255, 255));
		tabbedPane.setBackgroundAt(0,Color.decode(Constants.BACK_COLOR));
		
		JPanel expressionPane = new JPanel();
		expressionPane.setBackground(Color.decode(Constants.BACK_COLOR));
		scrollPane.setViewportView(expressionPane);
		
		BooleanDeclaratorFactory blndclrtrfctrBoolean = new BooleanDeclaratorFactory();
		blndclrtrfctrBoolean.setToolTipText("boolean rinokwanisa kutakura zvinhu zviviri chete, true na false.\r\n");
		blndclrtrfctrBoolean.setAlignmentX(Component.CENTER_ALIGNMENT);
		blndclrtrfctrBoolean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		StringDeclaratorFactory strngdclrtrfctrString = new StringDeclaratorFactory();
		strngdclrtrfctrString.setToolTipText("string rakaenzana neshoko mumutauro wamazuva ose.");
		strngdclrtrfctrString.setAlignmentX(Component.CENTER_ALIGNMENT);
		strngdclrtrfctrString.setText("string");
		
		DoubleDeclaratorFactory dbldclrtrfctrDouble = new DoubleDeclaratorFactory();
		dbldclrtrfctrDouble.setToolTipText("double inhamba ine koma");
		dbldclrtrfctrDouble.setAlignmentX(Component.CENTER_ALIGNMENT);
		dbldclrtrfctrDouble.setText("double");
		blndclrtrfctrBoolean.setText("boolean");
		expressionPane.setLayout(new GridLayout(0, 2, 0, 0));
		expressionPane.add(strngdclrtrfctrString);
		
		IntDeclaratorFactory ntdclrtrfctrInteger = new IntDeclaratorFactory();
		ntdclrtrfctrInteger.setToolTipText("int inhamba isina koma");
		ntdclrtrfctrInteger.setText("int");
		expressionPane.add(ntdclrtrfctrInteger);
		expressionPane.add(dbldclrtrfctrDouble);
		expressionPane.add(blndclrtrfctrBoolean);
		
		MainMethodFactory mnmthdfctrMainMethod = new MainMethodFactory();
		mnmthdfctrMainMethod.setToolTipText("Ndipo panotangira kufamba program");
		mnmthdfctrMainMethod.setText("main()");
		expressionPane.add(mnmthdfctrMainMethod);
		
		PrintFactory prntfctrPrint = new PrintFactory();
		prntfctrPrint.setToolTipText("print anyora zvabuda muprogram");
		prntfctrPrint.setAlignmentX(Component.CENTER_ALIGNMENT);
		prntfctrPrint.setText("print");
		expressionPane.add(prntfctrPrint);
		
		PlusFactory plsfctrPlus = new PlusFactory();
		plsfctrPlus.setToolTipText("+ akafanana na + wekusvomhu");
		plsfctrPlus.setText("+");
		expressionPane.add(plsfctrPlus);
		
		SubtractFactory sbtrctfctrSubtract = new SubtractFactory();
		sbtrctfctrSubtract.setFont(new Font("Verdana", Font.BOLD, 21));
		sbtrctfctrSubtract.setToolTipText("- akafanana na - wekusvomhu");
		sbtrctfctrSubtract.setText("-");
		expressionPane.add(sbtrctfctrSubtract);
		
		MultiplyFactory mltplfctrMultiply = new MultiplyFactory();
		mltplfctrMultiply.setFont(new Font("Verdana", Font.BOLD, 20));
		mltplfctrMultiply.setToolTipText("* akafanana na x wekusvomhu");
		mltplfctrMultiply.setText("*");
		expressionPane.add(mltplfctrMultiply);
		
		DivideFactory dvdfctrDivide = new DivideFactory();
		dvdfctrDivide.setToolTipText("+ akafanana na / (devide) wekusvomhu");
		dvdfctrDivide.setText("/");
		expressionPane.add(dvdfctrDivide);
		
		AssignmentFactory sgnmntfctrAssignment = new AssignmentFactory();
		sgnmntfctrAssignment.setToolTipText("anoisa zvirikuruboshwe muVariable ririkurudyi");
		sgnmntfctrAssignment.setText("=");
		expressionPane.add(sgnmntfctrAssignment);
		
		EqualFactory qlfctrEqual = new EqualFactory();
		qlfctrEqual.setToolTipText("== akafanana na = wekusvomhu");
		qlfctrEqual.setText("==");
		expressionPane.add(qlfctrEqual);
		
		GreaterFactory grtrfctrGreater = new GreaterFactory();
		grtrfctrGreater.setToolTipText("> akafanana na > wekusvomhu");
		grtrfctrGreater.setText(">");
		expressionPane.add(grtrfctrGreater);
		
		LessFactory lsfctrLess = new LessFactory();
		lsfctrLess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		lsfctrLess.setToolTipText("<akafanana na < wekusvomhu");
		lsfctrLess.setText("<");
		expressionPane.add(lsfctrLess);
		
		GreaterEqualFactory grtrqlfctrGreaterOrEqual = new GreaterEqualFactory();
		grtrqlfctrGreaterOrEqual.setToolTipText(">= akafanana na greater or equal wekusvomhu");
		grtrqlfctrGreaterOrEqual.setText(">=");
		expressionPane.add(grtrqlfctrGreaterOrEqual);
		
		LessEqualFactory lsqlfctrLessOrEqual = new LessEqualFactory();
		lsqlfctrLessOrEqual.setToolTipText("<= akafanana na less or equal wekusvomhu");
		lsqlfctrLessOrEqual.setText("<=");
		expressionPane.add(lsqlfctrLessOrEqual);
		
		PlaholderFactory plaholderFactory_20 = new PlaholderFactory();
		expressionPane.add(plaholderFactory_20);
		
		PlaholderFactory plaholderFactory_19 = new PlaholderFactory();
		expressionPane.add(plaholderFactory_19);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setToolTipText("Intermediate level elements, use these after understanding of beginner level elements is atained.");
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tabbedPane.addTab("Intermediate", null, scrollPane_1, null);
		tabbedPane.setBackgroundAt(1, new Color(255, 0, 0));
		
		JPanel expressionPane2 = new JPanel();
		expressionPane2.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(expressionPane2);
		expressionPane2.setLayout(new GridLayout(0, 2, 0, 0));
		
		PreIncreamentFactory prncrmntfctrx = new PreIncreamentFactory();
		prncrmntfctrx.setToolTipText("Anotanga awedzera zviri muVariable rakapihwa na 1 ozokupa zvitsva zvavamuVariable. variable racho ndere int chete");
		prncrmntfctrx.setText("++x");
		expressionPane2.add(prncrmntfctrx);
		
		PreDecreamentFactory prdcrmntfctrx = new PreDecreamentFactory();
		prdcrmntfctrx.setFont(new Font("Verdana", Font.BOLD, 18));
		prdcrmntfctrx.setToolTipText("Anotanga adzikisa zviri muVariable rakapihwa na 1 ozokupa zvitsva zvavamuVariable. variable racho ndere int chete");
		prdcrmntfctrx.setText("--x");
		expressionPane2.add(prdcrmntfctrx);
		
		PostIncreamentFactory pstncrmntfctrX = new PostIncreamentFactory();
		pstncrmntfctrX.setToolTipText("Anotanga akupa zviri muVariable rakapihwa ozowedzera zvirimuvariable na 1. variable racho ndere int chete");
		pstncrmntfctrX.setText("x++");
		expressionPane2.add(pstncrmntfctrX);
		
		PostDecreamentFactory pstdcrmntfctrX = new PostDecreamentFactory();
		pstdcrmntfctrX.setFont(new Font("Verdana", Font.BOLD, 18));
		pstdcrmntfctrX.setToolTipText("Anotanga akupa zviri muVariable rakapihwa ozodzikisa zvirimuvariable na 1. variable racho ndere int chete");
		pstdcrmntfctrX.setText("x--");
		expressionPane2.add(pstdcrmntfctrX);
		
		ModulusFactory mdlsfctrZvinosaraMukupinda = new ModulusFactory();
		mdlsfctrZvinosaraMukupinda.setToolTipText("% anoita division ozokupa remainder kana iripo, kana isipo anokupa zero");
		mdlsfctrZvinosaraMukupinda.setText("%");
		expressionPane2.add(mdlsfctrZvinosaraMukupinda);
		
		NotFactory ntfctrPindura = new NotFactory();
		ntfctrPindura.setFont(new Font("Verdana", Font.BOLD, 18));
		ntfctrPindura.setToolTipText("anoshandura value yeboolean kuenda kune value inopikisa");
		ntfctrPindura.setText("!");
		expressionPane2.add(ntfctrPindura);
		
		AndFactory ndfctrUye = new AndFactory();
		ndfctrUye.setToolTipText("anoita zvinoita logical AND.");
		ndfctrUye.setText("&&");
		expressionPane2.add(ndfctrUye);
		
		OrFactory rfctrKana = new OrFactory();
		rfctrKana.setToolTipText("anoita zvinoita logical OR .");
		rfctrKana.setText("||");
		expressionPane2.add(rfctrKana);
		
		IfFactory fctrIf = new IfFactory();
		fctrIf.setToolTipText("anoita zviri mukati make kana boolean raapihwa riri true");
		fctrIf.setText("IF");
		expressionPane2.add(fctrIf);
		
		ElseFactory lsfctrIfElse = new ElseFactory();
		lsfctrIfElse.setToolTipText("anoita zviri mukati make kana boolean raapihwa riri true,\r\n kana riri false anoita zviri mukati make panzvimbo yepiri");
		lsfctrIfElse.setText("IF ELSE");
		expressionPane2.add(lsfctrIfElse);
		
		SwitchFactory swtchfctrSwitch = new SwitchFactory();
		swtchfctrSwitch.setToolTipText("anoita zviri pasarudzo inoenderana nenhamba yakapihwa");
		swtchfctrSwitch.setText("switch");
		expressionPane2.add(swtchfctrSwitch);
		
		CaseFactory csfctrCase = new CaseFactory();
		csfctrCase.setToolTipText("iyi isarudzo inoiswa muna switch");
		csfctrCase.setText("case");
		expressionPane2.add(csfctrCase);
		
		RepeatFactory rptfctrRepeat = new RepeatFactory();
		rptfctrRepeat.setToolTipText("anodzokora kweuwandu hwakapihwa");
		rptfctrRepeat.setText("repeat");
		expressionPane2.add(rptfctrRepeat);
		
		PlaholderFactory plaholderFactory = new PlaholderFactory();
		expressionPane2.add(plaholderFactory);
		
		PlaholderFactory plaholderFactory_2 = new PlaholderFactory();
		expressionPane2.add(plaholderFactory_2);
		
		PlaholderFactory plaholderFactory_1 = new PlaholderFactory();
		expressionPane2.add(plaholderFactory_1);
		
		PlaholderFactory plaholderFactory_15 = new PlaholderFactory();
		expressionPane2.add(plaholderFactory_15);
		
		PlaholderFactory plaholderFactory_3 = new PlaholderFactory();
		expressionPane2.add(plaholderFactory_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setToolTipText("Advanced level elements.");
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tabbedPane.addTab("Advanced", null, scrollPane_2, null);
		tabbedPane.setBackgroundAt(2, new Color(255, 102, 204));
		
		JPanel expressionPane3 = new JPanel();
		expressionPane3.setBackground(Color.WHITE);
		scrollPane_2.setViewportView(expressionPane3);
		expressionPane3.setLayout(new GridLayout(0, 2, 0, 0));
		
		ForFactory frfctrFor = new ForFactory();
		frfctrFor.setToolTipText("");
		frfctrFor.setText("For");
		expressionPane3.add(frfctrFor);
		
		MethodDeclarationFactory mthdclrtnfctrMaitiro = new MethodDeclarationFactory();
		mthdclrtnfctrMaitiro.setToolTipText("inoshandiswa kugadzira maitirwo echinhu\r\n icho chaunozo kwanisa kuramba\r\n uchidzokorora kuburikidza nokuidana.\r\n inotora maparameters anomiririra\r\n umbowo waichazopihwa painodanwa.");
		mthdclrtnfctrMaitiro.setText("method");
		expressionPane3.add(mthdclrtnfctrMaitiro);
		
		DoFactory dfctrDoWhile = new DoFactory();
		dfctrDoWhile.setToolTipText("inotanga yaita zvirimukati mayo, yozotarisa\r\n boolean rakapihwa. yodzokorora kana riri true");
		dfctrDoWhile.setText("Do While");
		expressionPane3.add(dfctrDoWhile);
		
		InputFactory nptfctrTora = new InputFactory();
		nptfctrTora.setToolTipText("inoita kuti munhu akwanise kupa umbowo kuburikidza ne console riri kuzasi.");
		nptfctrTora.setText("input");
		expressionPane3.add(nptfctrTora);
		
		WhileFactory whlfctrKunge = new WhileFactory();
		whlfctrKunge.setToolTipText("inotanga yatarisa kuti boolean rapihwa rakamira sei. kana riri true inoita zvirimukati, yotarisa zvakare. kana risiri yopfuurira.");
		whlfctrKunge.setText("while");
		expressionPane3.add(whlfctrKunge);
		
		ToDoubleFactory tdblfctrStringToDouble = new ToDoubleFactory();
		tdblfctrStringToDouble.setFont(new Font("Verdana", Font.BOLD, 9));
		tdblfctrStringToDouble.setToolTipText("inoshandura izwi kuisa ku double");
		tdblfctrStringToDouble.setText("(double) \"string\"");
		expressionPane3.add(tdblfctrStringToDouble);
		
		PlaholderFactory plaholderFactory_6 = new PlaholderFactory();
		expressionPane3.add(plaholderFactory_6);
		
		ToBooleanFactory tblnfctrStringToBoolean = new ToBooleanFactory();
		tblnfctrStringToBoolean.setFont(new Font("Verdana", Font.BOLD, 9));
		tblnfctrStringToBoolean.setToolTipText("inoshandura izwi kuisa ku boolean");
		tblnfctrStringToBoolean.setText("(boolean) \"string\"");
		expressionPane3.add(tblnfctrStringToBoolean);
		
		PlaholderFactory plaholderFactory_4 = new PlaholderFactory();
		expressionPane3.add(plaholderFactory_4);
		
		ToIntFactory tntfctrStringToInteger = new ToIntFactory();
		tntfctrStringToInteger.setFont(new Font("Verdana", Font.BOLD, 9));
		tntfctrStringToInteger.setToolTipText("inoshandura izwi kuisa ku integer");
		tntfctrStringToInteger.setText("(int) \"string\"");
		expressionPane3.add(tntfctrStringToInteger);
		
		PlaholderFactory plaholderFactory_7 = new PlaholderFactory();
		expressionPane3.add(plaholderFactory_7);
		
		PlaholderFactory plaholderFactory_9 = new PlaholderFactory();
		expressionPane3.add(plaholderFactory_9);
		
		PlaholderFactory plaholderFactory_8 = new PlaholderFactory();
		expressionPane3.add(plaholderFactory_8);
		
		PlaholderFactory plaholderFactory_13 = new PlaholderFactory();
		expressionPane3.add(plaholderFactory_13);
		
		PlaholderFactory plaholderFactory_11 = new PlaholderFactory();
		expressionPane3.add(plaholderFactory_11);
		
		PlaholderFactory plaholderFactory_17 = new PlaholderFactory();
		expressionPane3.add(plaholderFactory_17);
		
		PlaholderFactory plaholderFactory_10 = new PlaholderFactory();
		expressionPane3.add(plaholderFactory_10);
		
		PlaholderFactory plaholderFactory_12 = new PlaholderFactory();
		expressionPane3.add(plaholderFactory_12);
	}


}
