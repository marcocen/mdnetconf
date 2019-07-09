class device::Server1::Apache {
	class { 'apache':
		version => '2.2',
		conf_dir => '/etc/apache2',
		docroot => '/var/www/html',
		lib_path => '/usr/lib/apache2/modules',
		logroot => '/var/log/apache2',
		servername => 'www.example.com',
		vhost_dir => '/etc/apache2/sites-available',
		
	}
	
	include configurations::apache::S1Apache
}
