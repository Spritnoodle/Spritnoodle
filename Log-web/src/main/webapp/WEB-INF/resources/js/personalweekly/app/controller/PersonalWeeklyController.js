Ext.define('personalweekly.controller.PersonalWeeklyController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.PersonalWeeklyController',
	stores : [ 'PersonalWeeklyStore' ],
	models : [ 'PersonalWeeklyModel' ],
	views : [ 'PersonalWeeklyGrid', 'PersonalWeeklyEdit' ],
	init : function() {
		this.control({
			'personalweeklyGrid' : {
				itemdblclick : this.editPersonalWeekly
			},
			'personalweeklyEdit button[action=save]' : {
				click : this.updatePersonalWeekly
			}
		});
	},
	editPersonalWeekly : function(grid, record) {
		var view = Ext.widget('personalweeklyEdit');
		view.down('form').loadRecord(record);
	},
	updatePersonalWeekly : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
