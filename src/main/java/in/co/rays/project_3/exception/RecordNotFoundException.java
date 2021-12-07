package in.co.rays.project_3.exception;


/** RecordNotFoundException thrown when a record not found occurred
 * 
 * @author ShubHam
 *
 */
public class RecordNotFoundException extends Exception{
	public RecordNotFoundException(String msg){
		super(msg);
	}
}
