class configurations::apache::S1Apache {
	apache::vhost { 'S1Apache':
		vhost_name => 'server1.example.com',
		port => '80',
		docroot => '/var/www/user',
		docroot_owner => 'www-data',
		docroot_group => 'www-data',
		ssl => 'true',
		
	}
}
