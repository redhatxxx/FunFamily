package org.fun.web.dao;

import java.util.List;

import org.fun.web.dao.bean.ActivityBaseBean;
import org.fun.web.dao.bean.GroupBaseBean;

public interface IGroupBaseDao {
	GroupBaseBean addGroup(GroupBaseBean dao);
	GroupBaseBean getGroup(String groupId);
	boolean delGroup(String groupId);
	boolean updateGroup(GroupBaseBean dao);
	List<GroupBaseBean> getGroupList(List conditions);
}
