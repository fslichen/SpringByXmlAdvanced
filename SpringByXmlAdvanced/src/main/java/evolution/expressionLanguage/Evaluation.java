package evolution.expressionLanguage;

import java.util.Date;
import java.util.List;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Evaluation {
	public static void main(String[] args) {
		Date date = new Date();
		EvaluationContext evaluationContext = new StandardEvaluationContext();
		evaluationContext.setVariable("dateBeanId", date);
		// Every bean in spring is stored inside the evaluationContext.
		String string = "#dateBeanId.getYear()";
		ExpressionParser expressionParser = new SpelExpressionParser();
		Expression expression = expressionParser.parseExpression(string);
		Object year = expression.getValue(evaluationContext);
		System.out.println((Integer) year + 1900);

		// Element Extraction; Like Java Stream
		string = "{'Elsa', 'Anna', 'Cinderella'}";
		expression = expressionParser.parseExpression(string);
		List<String> strings = (List<String>) expression.getValue();
		evaluationContext.setVariable("stringsBeanId", strings);
		// Put the elements with length > 6 inside a new list.
		string = "#stringsBeanId.?[length() > 4]";
		expression = expressionParser.parseExpression(string);
		Object result = expression.getValue(evaluationContext);
		System.out.println(result);

		// Element Mapping; Like Java Stream
		string = "#stringsBeanId.![length()]";
		expression = expressionParser.parseExpression(string);
		result = expression.getValue(evaluationContext);
		System.out.println(result);
	}
}
