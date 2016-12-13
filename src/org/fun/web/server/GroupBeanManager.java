package org.fun.web.server;

import java.util.List;

import org.fun.web.dao.GroupBaseDao;
import org.fun.web.dao.IGroupBaseDao;
import org.fun.web.dao.bean.GroupBaseBean;
import org.springframework.stereotype.Service;

@Service
public class GroupBeanManager implements IGroupBeanManager {

	private IGroupBaseDao groupdao; 
	
	public IGroupBaseDao getGroupdao() {
		return groupdao;
	}

	public void setGroupdao(GroupBaseDao groupdao) {
		this.groupdao = groupdao;
	}

	@Override
	public GroupBaseBean addGroup(GroupBaseBean dao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GroupBaseBean getGroup(String groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delGroup(String activityId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateGroup(GroupBaseBean dao) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<GroupBaseBean> getGroupList(List conditions) {
		// TODO Auto-generated method stub
		return null;
	}

}
