package buzz.xinyan.team.view;

import buzz.xinyan.team.domain.Employee;
import buzz.xinyan.team.service.NameListService;
import buzz.xinyan.team.service.TeamException;
import buzz.xinyan.team.service.TeamService;

public class TeamView {
	NameListService listSvc = new NameListService();
	TeamService teamSvc = new TeamService();
	
	/**
	* @Description	主界面显示及控制方法。
	* @author Ivan Xin
	 * @throws TeamException 
	* @date 2020年12月1日下午5:11:36
	 */
	public void enterMainMenu() throws TeamException {
		// TODO Auto-generated method stub
		boolean isTrue = true;
		while(isTrue) {
			listAllEmployees();
			System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4):");
			char menu = TSUtility.readMenuSelection();
			switch(menu) {
			case '1':
				getTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.print("确认是否退出(Y/N):");
				char isExit = TSUtility.readConfirmSelection();
				if(isExit == 'Y') {
					isTrue = false;
				}
			}
		}
	}
	
	/**
	 * 
	* @Description  以表格形式列出公司所有成员
	* @author Ivan Xin
	 * @throws TeamException 
	* @date 2020年12月1日下午5:13:10
	 */
	private void listAllEmployees() throws TeamException {
		// TODO Auto-generated method stub
		System.out.println("---------------开发团队调度软件-----------------------\n");
		Employee[] allEmployee = listSvc.getAllEmployee();
		if(allEmployee.length ==0 || allEmployee == null) {
			throw new TeamException("公司没得员工！");
		}else {
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			for(int i = 0; i < allEmployee.length;i++) {
				System.out.println(allEmployee[i]);
			}
			System.out.println("------------------------------------------------------");
		}
	}
	/**
	 * 
	* @Description    显示团队成员列表操作
	* @author Ivan Xin
	* @date 2020年12月1日下午5:15:08
	 */
	private void getTeam() {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	* @Description  实现添加成员操作
	* @author Ivan Xin
	* @date 2020年12月1日下午5:15:38
	 */
	private void addMember() {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 
	* @Description  实现删除成员操作
	* @author Ivan Xin
	* @date 2020年12月1日下午5:16:15
	 */
	private void deleteMember() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		TeamView t = new TeamView();
		try {
			t.enterMainMenu();
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

