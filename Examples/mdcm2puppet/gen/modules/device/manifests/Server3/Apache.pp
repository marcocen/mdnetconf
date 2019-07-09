class device::Server3::Apache {
	class { 'apache':
		version => '2.2',
		conf_dir => '/etc/apache',
		docroot => '/var/www/html',
		logroot => '/var/log/apache',
		servername => 'www.webserver.com',
		vhost_dir => '/etc/apache2/sites-available',
		
	}
	
	include configurations::apache::S3Apache
}
