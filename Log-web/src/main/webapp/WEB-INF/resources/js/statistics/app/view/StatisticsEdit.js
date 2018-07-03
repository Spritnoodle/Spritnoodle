Ext.define('statistics.view.StatisticsEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.statisticsEdit',
	title : '编辑消息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'textfield',
				name : 'statistics',
				fieldLabel : '用户'
			}, {
				xtype : 'textfield',
				name : 'tag',
				fieldLabel : '周报状态'
			}, {
				xtype : 'textfield',
				name : 'count',
				fieldLabel : '周报数量'
			} ]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
