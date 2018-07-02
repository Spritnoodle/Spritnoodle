Ext.define('personalweekly.view.PersonalWeeklyEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.personalweeklyEdit',
	title : '编辑学生信息',
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
				name : 'message',
				fieldLabel : 'MESSAGE'
			}, {
				xtype : 'textfield',
				name : 'date',
				fieldLabel : 'DATE'
			}, {
				xtype : 'textfield',
				name : 'uname',
				fieldLabel : 'UNAME'
			}, {
				xtype : 'textfield',
				name : 'uid',
				fieldLabel : 'UID'
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
