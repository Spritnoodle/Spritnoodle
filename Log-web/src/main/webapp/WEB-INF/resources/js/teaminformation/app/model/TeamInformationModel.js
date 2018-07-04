Ext.define('teaminformation.model.TeamInformationModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.teaminformationModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'tid',
		type : 'string',
		sortable : true
	}, {
		name : 'tname',
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