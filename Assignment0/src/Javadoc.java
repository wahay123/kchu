
public class Javadoc {

}
/**
 * doConvsersion() - to read infix from input and convert it along with the
 * read Infix() and class stack
 * 
 * i++ to read each String[] readInfix element 
 * if (the element is "(" )
 * 		Stack.push()
 * 		i++
 * 
 * else if(it is ")" )
 * 			for loop
 * 				if stack.list[i] is equals to "("
 * 					pop it from the stack
 * 					and break the for loop
 * 				else
 * 					put it into postfix
 * 					then pop it from the stack
 * 					i--
 * 					
 *  	
 *    
 * else if (it is an operator) 
 * 		if( stack is empty) 
 * 			Stack.push() 
 * 		else //stack is not empty
 * 			if(the infix operator is smaller or equal to the one is stack.top
 * 				while(stack is not empty)
 * 					put stack.top into postfix
 * 					pop stack.top
 * 
 * 				put the infix operator into stack
 * 				
 * 			else
 * 				stack.push the infix operator
 * 				

 * 		
 * 
 * else //it is numeric or algebra
 * 		 it will be stored into postfix array
 * 
 * 
 * print out postfix
 * 
 */