Ext.define('teaminformation.view.TeamInformationEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.teaminformationEdit',
	title : '编辑学生信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'textfield',
				name : 'tid',
				fieldLabel : 'TID'
			}, {
				xtype : 'textfield',
				name : 'tname',
				fieldLabel : 'TNAME'
			} ]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
