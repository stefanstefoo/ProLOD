--%1$s maintable partition
-- %2$s constraint view
-- %3$s constraint condition


SELECT distinct MT.subject_id, MT.internallink_id
	FROM %1$s MT %2$s
		WHERE MT.subject_id IS NOT NULL
		AND MT.internallink_id IS NOT NULL
		%3$s
			ORDER BY MT.subject_id