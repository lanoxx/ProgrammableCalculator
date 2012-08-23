package at.ac.prog.calculator;

import at.ac.prog.calculator.engine.CalcParser;


public class RunCalcTest {
	
	public static void main(String[] args) {
		
		CalcParser parser = new CalcParser();
		try {
			parser.parse("0 [9][9~][4!5#2+#@]@");
			parser.debugOutput();
			
			parser.parse("0 4!5#2+#34@");
			parser.debugOutput();
			
			parser.parse("0 [9][9~[4!5#2+#@]][]@");
			parser.debugOutput();
			
			parser.parse(" [\n\"E\"i\"n\"g\"a\"b\"e\":\"\\ \"?@']");
			parser.debugOutput();
			
			parser.parse(" \n\"E\"i\"n\"g\"a\"b\"e\":\"\\ \"?@'");
			parser.debugOutput();
			
			parser.parse(" [[\nEingabe:\\ ]\"?@']");
			parser.debugOutput();
			
			parser.parse("3 [3!3!1-2!1=[]5![4!5#2+#@]@3#*]3!4#3!@3#");
			parser.debugOutput();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
 

	}

}
