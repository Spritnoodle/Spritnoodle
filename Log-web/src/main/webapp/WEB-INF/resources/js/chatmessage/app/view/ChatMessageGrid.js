var pageSize = 20;

var chatmessageStore = Ext.create('chatmessage.store.ChatMessageStore');

Ext.define('chatmessage.view.ChatMessageGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.chatmessageGrid',
	title : 'Java EE chatmessage 信息',
	store : chatmessageStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "聊天消息",
		width : 200,
		sortable : true,
		dataIndex : 'chatmessage'
	}, {
		text : "日期",
		width : 150,
		sortable : true,
		dataIndex : 'date'
	}, {
		text : "发言人",
		width : 80,
		sortable : true,
		dataIndex : 'spokesman'
	}, {
		text : "添加时间",
		width : 150,
		dataIndex : 'dateCreated',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	}, {
		text : "修改时间",
		width : 150,
		dataIndex : 'dateModified',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : chatmessageStore,
		displayInfo : true,
		firstTest : '首页',
		lastText : '尾页',
		nextText : '下页',
		prevText : '前页',
		beforePageText : '第',
		afterPageText : '页，共{0}页',
		displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
		emptyMsg : "没有记录"
	})
});
