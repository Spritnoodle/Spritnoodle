package edu.zut.cs.javaee.log.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.javaee.log.admin.dao.MessageDao;
import edu.zut.cs.javaee.log.admin.domain.Message;
import edu.zut.cs.javaee.log.admin.service.MessageManager;
import edu.zut.cs.javaee.log.base.service.impl.GenericTreeManagerImpl;

/**
 * 
 * @author yifei
 *
 */
// 实例化MessageManager
@Service("messageManager")
// 声明事务
@Transactional
public class MessageManagerImpl extends GenericTreeManagerImpl<Message, Long> implements MessageManager {

	MessageDao messageDao;

	@Autowired
	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
		this.treeDao = this.messageDao;
		this.dao = this.treeDao;
	}

}
