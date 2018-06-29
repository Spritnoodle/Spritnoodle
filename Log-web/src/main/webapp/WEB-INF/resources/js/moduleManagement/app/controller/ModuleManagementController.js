Ext.define('moduleManagement.controller.ModuleManagementController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.moduleManagementController',
	stores : [ 'ModuleManagementStore' ],
	models : [ 'ModuleManagementModel' ],
	views : [ 'ModuleManagementGrid', 'ModuleManagementEdit' ],
	init : function() {
		this.control({
			'moduleManagementGrid' : {
				itemdblclick : this.editModuleManagement
			},
			'moduleManagementEdit button[action=save]' : {
				click : this.updateModuleManagement
			}
		});
	},
	editStudent : function(grid, record) {
		var view = Ext.widget('moduleManagementEdit');
		view.down('form').loadRecord(record);
	},
	updateModuleManagement : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
