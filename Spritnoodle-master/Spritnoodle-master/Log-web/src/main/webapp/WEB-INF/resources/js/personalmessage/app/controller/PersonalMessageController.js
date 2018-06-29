Ext.define('personalmessage.controller.PersonalMessageController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.PersonalMessageController',
	stores : [ 'PersonalMessageStore' ],
	models : [ 'PersonalMessageModel' ],
	views : [ 'PersonalMessageGrid', 'PersonalMessageEdit' ],
	init : function() {
		this.control({
			'personalmessageGrid' : {
				itemdblclick : this.editPersonalMessage
			},
			'personalmessageEdit button[action=save]' : {
				click : this.updatePersonalMessage
			}
		});
	},
	editPersonalMessage : function(grid, record) {
		var view = Ext.widget('personalmessageEdit');
		view.down('form').loadRecord(record);
	},
	updatePersonalMessage : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
