class configurations::firewall::S2FirewallRule2 {
	firewall { '002 reject local traffic not on loopback interface':
		action => 'reject',
		protocol => 'all',
		dst_range => '127.0.0.1/8',
		iniface => '! lo',
		
	}
}
