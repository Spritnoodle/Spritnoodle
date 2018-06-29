Ext.define('personalmessage.view.PersonalMessageEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.personalmessageEdit',
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
				name : 'personalmessage',
				fieldLabel : 'PERSONALMESSAGE'
			}, {
				xtype : 'textfield',
				name : 'grade',
				fieldLabel : 'GRADE'
			}, {
				xtype : 'textfield',
				name : 'name',
				fieldLabel : 'NAME'
			}, {
				xtype : 'textfield',
				name : 'cno',
				fieldLabel : 'CNO'
			}, {
				xtype : 'textfield',
				name : 'task',
				fieldLabel : 'TASK'
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
