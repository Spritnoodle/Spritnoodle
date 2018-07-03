Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'personalweekly',
	appFolder : server_context + '/resources/js/personalweekly/app',
	controllers : [ 'PersonalWeeklyController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'personalweeklyGrid'
			} ]
		});
	}
});
