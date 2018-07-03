Ext.define('chatmessage.view.ChatMessageEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.chatmessageEdit',
	title : '编辑聊天信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 180,
			width : 260,
			border : false,
			items : [ 
			{
				xtype : 'textfield',
				name : 'spokesman',
				fieldLabel : '发言人'
			}, {
				xtype : 'textfield',
				name : 'date',
				fieldLabel : '日期'
			},{
				xtype : 'textarea',
				name : 'chatmessage',
				fieldLabel : '聊天消息'
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
