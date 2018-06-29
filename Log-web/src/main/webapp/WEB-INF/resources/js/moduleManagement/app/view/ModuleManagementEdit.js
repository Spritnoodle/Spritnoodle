Ext.define('moduleManagement.view.ModuleManagementEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.moduleManagementEdit',
	title : '编辑任务模块信息',
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
				name : 'module1',
				fieldLabel : '任务模块'
			}, {
				xtype : 'textfield',
				name : 'name1',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'group1',
				fieldLabel : '小组'
			}]
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
