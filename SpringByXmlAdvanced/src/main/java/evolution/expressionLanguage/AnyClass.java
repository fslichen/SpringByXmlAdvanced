package evolution.expressionLanguage;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class AnyClass {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Spring expression is able to get the value of mathematics expression.
		String string = "2*8*80-100";
		ExpressionParser expressionParser = new SpelExpressionParser();
		Expression expression = expressionParser.parseExpression(string);
		System.out.println(expression.getValue());
		
		// Spring expression is able to parse java syntax.
		string = "new int[] {10, 20, 30}";
		expression = expressionParser.parseExpression(string);
		int[] intArray = (int[]) expression.getValue();
		System.out.println(Arrays.toString(intArray));
		
		// String expression is able to parse a list of strings.
		// It's inconvenient to use " within double quote, so you can use ' instead.
		string = "{'Elsa', 'Anna'}";
		expression = expressionParser.parseExpression(string);
		List<String> strings = (List<String>) expression.getValue();
		System.out.println(strings);
		
		// Spring expression is also able to parse map.
		string = "{{'zipCode' : '61820', 'name' : 'Champaign'}, {'zipCode' : '61801', 'name' : 'Urbana'}}";
		expression = expressionParser.parseExpression(string);
		List<?> maps = (List<?>) expression.getValue();
		System.out.println(maps);
		
		// Spring expression makes full use of reflect to call a certain method.
		string = "T(java.lang.Math).random()";
		expression = expressionParser.parseExpression(string);
		Double random = (Double) expression.getValue();
		System.out.println(random);
		
		// Same as above
		string = "new java.util.Date()";
		expression = expressionParser.parseExpression(string);
		Date date = (Date) expression.getValue();
		System.out.println(date);
	}
}
