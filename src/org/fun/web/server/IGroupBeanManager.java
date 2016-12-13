package org.fun.web.server;

import java.util.List;

import org.fun.web.dao.bean.GroupBaseBean;

public interface IGroupBeanManager {
	GroupBaseBean addGroup(GroupBaseBean dao);
	GroupBaseBean getGroup(String groupId);
	boolean delGroup(String activityId);
	boolean updateGroup(GroupBaseBean dao);
	List<GroupBaseBean> getGroupList(List conditions);
}
