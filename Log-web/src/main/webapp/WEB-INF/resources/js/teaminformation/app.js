Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'teaminformation',
	appFolder : server_context + '/resources/js/teaminformation/app',
	controllers : [ 'TeamInformationController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'teaminformationGrid'
			} ]
		});
	}
});
