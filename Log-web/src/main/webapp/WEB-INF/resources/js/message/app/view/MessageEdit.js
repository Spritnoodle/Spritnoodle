Ext.define('message.view.MessageEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.messageEdit',
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
				name : 'message',
				fieldLabel : '信息'
			}, {
				xtype : 'textfield',
				name : 'date',
				fieldLabel : '日期'
			}, {
				xtype : 'textfield',
				name : 'author',
				fieldLabel : '作者'
			}, {
				xtype : 'textfield',
				name : 'commenter',
				fieldLabel : '评论'
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
