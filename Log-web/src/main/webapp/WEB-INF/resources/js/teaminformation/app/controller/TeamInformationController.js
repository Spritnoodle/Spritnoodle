Ext.define('teaminformation.controller.TeamInformationController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.TeamInformationController',
	stores : [ 'TeamInformationStore' ],
	models : [ 'TeamInformationModel' ],
	views : [ 'TeamInformationGrid', 'TeamInformationEdit' ],
	init : function() {
		this.control({
			'teaminformationGrid' : {
				itemdblclick : this.editTeamInformation
			},
			'teaminformationEdit button[action=save]' : {
				click : this.updateTeamInformation
			}
		});
	},
	editTeamInformation : function(grid, record) {
		var view = Ext.widget('teaminformationEdit');
		view.down('form').loadRecord(record);
	},
	updateTeamInformation : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
