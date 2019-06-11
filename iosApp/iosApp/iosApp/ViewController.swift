//
//  ViewController.swift
//  iosApp
//
//  Created by Nate Ebel on 5/28/19.
//  Copyright © 2019 Nate Ebel. All rights reserved.
//

import UIKit
import main

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let viewModel = ViewModel()
        
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(25)
        label.text = viewModel.title
        view.addSubview(label)
    }


}

