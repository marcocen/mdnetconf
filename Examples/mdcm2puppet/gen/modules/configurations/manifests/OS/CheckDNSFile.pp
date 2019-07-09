class configuration::OS::CheckDNSFile{
	file { 'CheckDNSFile'
		path => '/etc/resolv.conf',
		ensure => 'present',
		
	}
}
