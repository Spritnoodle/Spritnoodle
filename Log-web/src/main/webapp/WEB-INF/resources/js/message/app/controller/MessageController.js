Ext.define('message.controller.MessageController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.MessageController',
	stores : [ 'MessageStore' ],
	models : [ 'MessageModel' ],
	views : [ 'MessageGrid', 'MessageEdit' ],
	init : function() {
		this.control({
			'MessageGrid' : {
				itemdblclick : this.editMessage
			},
			'MessageEdit button[action=save]' : {
				click : this.updateMessage
			}
		});
	},
	editMessage : function(grid, record) {
		var view = Ext.widget('messageEdit');
		view.down('form').loadRecord(record);
	},
	updateMessage : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
