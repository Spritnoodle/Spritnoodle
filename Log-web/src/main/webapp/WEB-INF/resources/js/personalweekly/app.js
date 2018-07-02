Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'personalWeekly',
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
