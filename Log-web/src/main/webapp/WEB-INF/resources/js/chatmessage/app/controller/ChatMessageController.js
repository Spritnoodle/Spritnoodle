Ext.define('chatmessage.controller.ChatMessageController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.chatmessageController',
	stores : [ 'ChatMessageStore' ],
	models : [ 'ChatMessageModel' ],
	views : [ 'ChatMessageGrid', 'ChatMessageEdit' ],
	init : function() {
		this.control({
			'chatmessageGrid' : {
				itemdblclick : this.editChatMessage
			},
			'chatmessageEdit button[action=save]' : {
				click : this.updateChatMessage
			}
		});
	},
	editChatMessage : function(grid, record) {
		var view = Ext.widget('chatmessageEdit');
		view.down('form').loadRecord(record);
	},
	updateChatMessage : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
