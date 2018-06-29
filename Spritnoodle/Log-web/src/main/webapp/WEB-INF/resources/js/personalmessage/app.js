Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'personalmessage',
	appFolder : server_context + '/resources/js/personalmessage/app',
	controllers : [ 'PersonalMessageController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'personalmessageGrid'
			} ]
		});
	}
});
