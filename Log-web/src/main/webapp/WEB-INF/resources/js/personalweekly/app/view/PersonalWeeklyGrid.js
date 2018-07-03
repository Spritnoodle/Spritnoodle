var pageSize = 20;

var personalweeklyStore = Ext.create('personalweekly.store.PersonalWeeklyStore');

Ext.define('personalweekly.view.PersonalWeeklyGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.personalweeklyGrid',
	title : 'Java EE personalweekly 信息',
	store : personalweeklyStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "MESSAGE",
		width : 120,
		sortable : true,
		dataIndex : 'message'
	}, {
		text : "DATE",
		width : 80,
		sortable : true,
		dataIndex : 'date'
	}, {
		text : "UNAME",
		width : 80,
		sortable : true,
		dataIndex : 'uname'
	}, {
		text : " UID",
		width : 80,
		sortable : true,
		dataIndex : 'uid'
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
		store : personalweeklyStore,
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
