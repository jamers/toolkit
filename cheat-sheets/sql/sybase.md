SELECT TOP 10
    sysobjects.name,
    Pages = SUM(DATA_PGS(sysindexes.id, ioampg)),
    Kbs = SUM(DATA_PGS(sysindexes.id, ioampg)) * (@@maxpagesize/1024)
FROM sysindexes, sysobjects
WHERE sysindexes.id = sysobjects.id
AND sysindexes.id > 100
AND (indid > 1)
GROUP BY sysobjects.name
ORDER BY Kbs DESC
go
