package 과제;

public class Bracket_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptExp opt = new OptExp();
		String exp = "(3*5)-(6-2)";
		
		System.out.println(exp);
		
		if(opt.testPair(exp))
			System.out.println("괄호 맞음!");
		else
			System.out.println("괄호 틀림!!");
		
		
		
	}

//	private static void infix_to_postfix(String exp) {
//		// TODO Auto-generated method stub
//		infix_to_postfix(exp){
//			while(true) do{
//				symbol ← getSymbol(exp);
//				case{
//					symbol = operand :
//						print(symbol);
//					symbol = orrerator :
//						push(stack, symbol);
//					symbol = ")" :
//						print(pop(stack));
//					symbol = null :
//						while(top >-1)do
//							print(pop(stack));
//					else : 
//					
//				}
//			}
//		}
//		end infix_to_postfix()
//	}
//
//	start evalPostfix(exp)
//		while(true)do {
//			symbol ← getSymbol(exp)
//			case{
//			symbol = operand : 
//				push(Stack, symbol);
//			symbol = operator : 
//				opr2 ← pop(Stack);
//				opr1 ← pop(Stack);
//				result ← opr1 op(symbol) opr2;
//				push(Stack,result);
//			symbol = null : 
//				print(pop(Stack));
//			}
//		}
//	end evalPostfix()
		
}
