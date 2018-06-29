Ext.define('moduleManagement.model.ModuleManagementModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.moduleManagementModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'module1',
		type : 'string',
		sortable : true
	}, {
		name : 'name1',
		type : 'string',
		sortable : true
	}, {
		name : 'group1',
		type : 'string',
		sortable : true
	},{
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});