Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'chatmessage',
	appFolder : server_context + '/resources/js/chatmessage/app',
	controllers : [ 'ChatMessageController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'chatmessageGrid'
			} ]
		});
	}
});
