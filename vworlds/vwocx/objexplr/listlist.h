// Copyright � 2000 Microsoft Corporation.  All rights reserved.
// In installing/viewing this source code, you agree to the terms of the
// Microsoft Research Source License (MSRSL) included in the root of this source tree
// and available from http://www.vworlds.org/license.asp.

#if !defined(AFX_LISTLIST_H__EF7D659C_0161_11D2_88BE_00C04FC32EF3__INCLUDED_)
#define AFX_LISTLIST_H__EF7D659C_0161_11D2_88BE_00C04FC32EF3__INCLUDED_

#if _MSC_VER >= 1000
#pragma once
#endif // _MSC_VER >= 1000
// LISTList.h : header file
//

#include "EdLstCtl.h"

/////////////////////////////////////////////////////////////////////////////
// CListList window

class CListList : public CEditorListCtrl
{
// Construction
public:
	CListList();

	void Sort();

// Attributes
public:
	int				m_iSortColumn;

// Operations
public:
	virtual void ShowButton(int nItem);
	virtual void DeleteButton();

// Overrides
	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CListList)
	//}}AFX_VIRTUAL

// Implementation
public:
	virtual ~CListList();

	// Generated message map functions
protected:
	//{{AFX_MSG(CListList)
	afx_msg int OnCreate(LPCREATESTRUCT lpCreateStruct);
	afx_msg void OnRButtonDown(UINT nFlags, CPoint point);
	afx_msg void OnColumnClick(NMHDR* pNMHDR, LRESULT* pResult);
	//}}AFX_MSG

	DECLARE_MESSAGE_MAP()
};

/////////////////////////////////////////////////////////////////////////////

//{{AFX_INSERT_LOCATION}}
// Microsoft Developer Studio will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_LISTLIST_H__EF7D659C_0161_11D2_88BE_00C04FC32EF3__INCLUDED_)
