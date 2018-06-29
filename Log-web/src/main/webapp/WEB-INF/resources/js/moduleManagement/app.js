Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'moduleManagement',
	appFolder : server_context + '/resources/js/moduleManagement/app',
	controllers : [ 'ModuleManagementController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'moduleManagementGrid'
			} ]
		});
	}
});
