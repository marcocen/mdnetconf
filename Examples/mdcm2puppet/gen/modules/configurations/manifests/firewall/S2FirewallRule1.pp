class configurations::firewall::S2FirewallRule1 {
	firewall { '000 accept all icmp':
		action => 'accept',
		protocol => 'icmp',
		
	}
}
