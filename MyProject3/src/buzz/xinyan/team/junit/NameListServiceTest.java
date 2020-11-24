package buzz.xinyan.team.junit;

import org.junit.Test;

import buzz.xinyan.team.domain.Employee;
import buzz.xinyan.team.service.NameListService;

/**
 * 
* @Description		对namelistService测试
* @author Ivan Xin  Email:xinyan7788@live.com
* @version
* @date 2020年11月24日下午10:55:10
*
 */
public class NameListServiceTest {
	
	@Test
		public void TestGetAllEmployees() {
		NameListService service =new NameListService();
		Employee[] employee = service.getAllEmployee();
		for(int i = 0;i < employee.length;i++) {
			System.out.println(employee[i]);
		}
	}
}
