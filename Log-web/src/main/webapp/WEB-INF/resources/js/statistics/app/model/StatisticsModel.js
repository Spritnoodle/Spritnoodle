Ext.define('statistics.model.StatisticsModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.statisticsModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'statistics',
		type : 'string',
		sortable : true
	}, {
		name : 'tag',
		type : 'string',
		sortable : true
	}, {
		name : 'count',
		type : 'string',
		sortable : true
	}, {
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