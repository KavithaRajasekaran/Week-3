package week3.day1.assignments;

public class Automation_prog5 extends MultipleLanguage_prog5 implements Language_prog5,TestTool_prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation_prog5 prog = new Automation_prog5();
		
		prog.lang("Java");
		prog.python("Python");
		prog.ruby("ruby");
		prog.selenium("selenium");
		
	}

	@Override
	public String selenium(String tetool) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String lang(String langu) {
		// TODO Auto-generated method stub
		return null;
	}

}
