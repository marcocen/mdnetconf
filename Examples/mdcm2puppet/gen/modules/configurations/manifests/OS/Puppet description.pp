class configuration::OS::Puppet description{
	registry_value { 'Puppet description'
		path => 'HKLM\System\CurrentControlSet\Services\Puppet\Description',
		ensure => 'present',
		type => 'string',
		port => 'The Puppet Agent service periodically manages your configuration',
		
	}
}
