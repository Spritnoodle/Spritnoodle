var pageSize = 20;

var teaminformationStore = Ext.create('teaminformation.store.TeamInformationStore');

Ext.define('teaminformation.view.TeamInformationGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.teaminformationGrid',
	title : 'Java EE teaminformation 信息',
	store : teaminformationStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "TID",
		width : 120,
		sortable : true,
		dataIndex : 'tid'
	}, {
		text : "TNAME",
		width : 80,
		sortable : true,
		dataIndex : 'tname'
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
		store : teaminformationStore,
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
