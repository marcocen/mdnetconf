class configurations::apache::S3Apache {
	apache::vhost { 'S3Apache':
		servername => 'server3.example.com',
		vhost_name => 'server3.example.com non-ssl',
		port => '80',
		docroot => 'C:/Program Files/Apache Software Foundation/Apache2.2/htdocs',
		ssl => 'false',
		
	}
}
